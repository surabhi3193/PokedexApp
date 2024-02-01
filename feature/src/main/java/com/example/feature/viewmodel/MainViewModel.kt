package com.example.pokedexapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.network.model.ResponseData
import com.example.pokedexapp.data.model.PokemonRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: PokemonRepository) : ViewModel() {

    val pokemonLiveData: LiveData<ResponseData>
        get() = repository.pokemonList

    init {
        viewModelScope.launch {
            repository.getPokemonData()
        }
    }
}