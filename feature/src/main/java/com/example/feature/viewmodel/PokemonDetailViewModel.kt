package com.example.pokedexapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.network.model.PokemonResponseModel
import com.example.pokedexapp.data.model.PokemonRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository,
) : ViewModel() {

    val pokemonLiveData: LiveData<PokemonResponseModel>
        get() = repository.pokemonDetail

    fun submitUserReview(id: String) {
        viewModelScope.launch {
            repository.getPokemonDetail(id)
        }
    }
}