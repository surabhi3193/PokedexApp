package com.example.pokedexapp.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.core.Constants.HEIGHT
import com.example.core.Constants.ID
import com.example.core.Constants.POKEMON_DETAIL
import com.example.core.Constants.STAT
import com.example.feature.PokedexApplication
import com.example.feature.R
import com.example.feature.databinding.ActivityPokemonDetailScreenBinding
import com.example.pokedexapp.viewmodel.PokemonDetailViewModel
import com.example.pokedexapp.viewmodel.PokemonDetailViewModelFactory
import getProgressDrawable
import javax.inject.Inject


class PokemonDetailScreen : ComponentActivity() {
    private lateinit var binding: ActivityPokemonDetailScreenBinding
    private var progressDrawable: CircularProgressDrawable? = null
    private lateinit var detailViewModel: PokemonDetailViewModel

    @Inject
    lateinit var detailViewModelFactory: PokemonDetailViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_pokemon_detail_screen)
        (application as PokedexApplication).applicationComponent.inject(this)
        actionBar?.title = POKEMON_DETAIL
        progressDrawable = getProgressDrawable(binding.root.context)
        detailViewModel =
            ViewModelProvider(this, detailViewModelFactory)[PokemonDetailViewModel::class.java]
        intent.getStringExtra(ID)?.let { detailViewModel.submitUserReview(it) }
        observeViewModel()

    }

    @SuppressLint("SetTextI18n")
    private fun observeViewModel() {

        detailViewModel.pokemonLiveData.observe(this) { pokemon ->
            pokemon?.let { detail ->
                binding.textview.text = detail.name
                binding.statsTV.text = STAT + detail.stats[0].stat?.name
                binding.heightTV.text = HEIGHT + detail.height.toString()
                val options =
                    RequestOptions().placeholder(progressDrawable).error(R.mipmap.ic_launcher_round)
                Glide.with(this).setDefaultRequestOptions(options)
                    .load(detail.sprites?.frontDefault).into(binding.imageView)

            }
        }
    }
}