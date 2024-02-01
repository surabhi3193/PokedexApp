package com.example.pokedexapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.SearchView.OnQueryTextListener
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.core.Constants.ERROR_MESSAGE
import com.example.core.Constants.ID
import com.example.feature.PokedexApplication
import com.example.feature.R
import com.example.feature.databinding.MainBinding
import com.example.home.data.adapter.DataAdapter
import com.example.home.data.adapter.OnClickListener
import com.example.network.model.PokemonDto
import com.example.pokedexapp.viewmodel.MainViewModel
import com.example.pokedexapp.viewmodel.MainViewModelFactory
import javax.inject.Inject


class MainActivity : ComponentActivity() {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var pokemonList: ArrayList<PokemonDto>
    private lateinit var dataAdapter: DataAdapter
    private lateinit var binding: MainBinding

    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        binding = DataBindingUtil.setContentView(this, R.layout.main)
        (application as PokedexApplication).applicationComponent.inject(this)
        mainViewModel = ViewModelProvider(
            this,
            mainViewModelFactory
        )[MainViewModel::class.java]

        pokemonList = arrayListOf()
        dataAdapter = DataAdapter(arrayListOf(), OnClickListener { item ->
            val intent = Intent(this, PokemonDetailScreen::class.java)
            intent.putExtra(ID, item.getId())
            startActivity(intent)
        })
        binding.pokemomsList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = dataAdapter
        }
        binding.swipeRefreshLayout.setOnRefreshListener {
            binding.swipeRefreshLayout.isRefreshing = false
        }
        binding.searchView.setOnQueryTextListener(object : OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(p0: String): Boolean {
                filter(p0)
                return true
            }
        })
        observeViewModel()
    }

    private fun filter(char: String) {
        val filteredList: ArrayList<PokemonDto> = ArrayList()
        for (item in pokemonList) {
            if (item.name?.contains(char, true)!!) {
                filteredList.add(item)
            }
        }
        if (filteredList.isEmpty()) Toast.makeText(this, ERROR_MESSAGE, Toast.LENGTH_LONG).show()
        else dataAdapter.filterList(filteredList)


    }

    private fun observeViewModel() {

        mainViewModel.pokemonLiveData.observe(this) {
                pokemon ->
            pokemon?.let {
                binding.pokemomsList.visibility = View.VISIBLE
                binding.loadingView.visibility = View.GONE
                if (pokemon.results.size > 0) {
                    pokemonList.addAll(pokemon.results)
                    dataAdapter.updatePokenList(pokemon.results)
                } else {
                    binding.pokemomsList.visibility = View.GONE

                }

            }
        }
    }
}
