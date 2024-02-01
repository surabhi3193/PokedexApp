package com.example.feature

import android.app.Application
import com.example.pokedexapp.di.ApplicationComponent
import com.example.pokedexapp.di.DaggerApplicationComponent

class PokedexApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
       applicationComponent = DaggerApplicationComponent.builder().build()
    }
}