package com.example.pokedexapp.di

import com.example.network.RetrofitClient
import com.example.pokedexapp.ui.MainActivity
import com.example.pokedexapp.ui.PokemonDetailScreen
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RetrofitClient::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(detailActivity: PokemonDetailScreen)

}