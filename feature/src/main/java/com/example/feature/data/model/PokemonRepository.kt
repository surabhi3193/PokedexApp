package com.example.pokedexapp.data.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.network.ApiEndPoint
import com.example.network.model.PokemonResponseModel
import com.example.network.model.ResponseData
import javax.inject.Inject

class PokemonRepository @Inject constructor(private val apiEndPoint: ApiEndPoint) {
    private val _pokemonlist = MutableLiveData<ResponseData>()
    private val _pokemonDetail = MutableLiveData<PokemonResponseModel>()

    val pokemonList: LiveData<ResponseData>
        get() = _pokemonlist

    val pokemonDetail: LiveData<PokemonResponseModel>
        get() = _pokemonDetail

    suspend fun getPokemonData() {
        if (apiEndPoint.getPokemonList()
                .body() != null
        ) _pokemonlist.postValue(apiEndPoint.getPokemonList().body())
    }

    suspend fun getPokemonDetail(id: String) {
        if (apiEndPoint.getPokemonDetails(id)
                .body() != null
        ) _pokemonDetail.postValue(apiEndPoint.getPokemonDetails(id).body())
    }
}