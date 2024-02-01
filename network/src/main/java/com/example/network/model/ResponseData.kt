package com.example.network.model

import com.google.gson.annotations.SerializedName

data class ResponseData(
    @SerializedName("count") var count: Int? = null,
    @SerializedName("next") var next: String? = null,
    @SerializedName("previous") var previous: String? = null,
    @SerializedName("results") var results: ArrayList<PokemonDto> = arrayListOf(),
)

data class PokemonDto(
    @SerializedName("name") var name: String? = null,
    @SerializedName("url") var url: String,
){
    fun getId(): String {
        val pattern = """/(\d+)/?$""".toRegex()
        val match = pattern.find(url)
        val pokemonNumber = match?.value?.substringBeforeLast("/") ?: "0"
        return pokemonNumber.replace("/", "")
    }
}