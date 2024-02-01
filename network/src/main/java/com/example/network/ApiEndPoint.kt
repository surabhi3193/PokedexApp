package com.example.network

import com.example.network.model.PokemonResponseModel
import com.example.network.model.ResponseData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiEndPoint {
    @GET("pokemon/?offset=0&limit=3")
    suspend fun getPokemonList(): Response<ResponseData>

    @GET("pokemon/{id}")
    suspend fun getPokemonDetails(@Path("id") id: String): Response<PokemonResponseModel>
}
