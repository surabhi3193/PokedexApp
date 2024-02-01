package com.example.pokedexapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.pokedexapp.ui.MainActivity

class SplashActivity : ComponentActivity() {
    val REQUEST_CODE = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, MainActivity::class.java)
        startActivityForResult(intent, REQUEST_CODE)
    }
}