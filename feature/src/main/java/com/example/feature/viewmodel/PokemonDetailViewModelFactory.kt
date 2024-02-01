package com.example.pokedexapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.pokedexapp.data.model.PokemonRepository
import javax.inject.Inject

class PokemonDetailViewModelFactory @Inject constructor(private val repository: PokemonRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PokemonDetailViewModel(repository) as T
    }
}