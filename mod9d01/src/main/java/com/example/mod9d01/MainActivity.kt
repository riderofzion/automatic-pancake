package com.example.mod9d01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    val vm by viewModels<PokemonVM>(){PokemonVM.Factory}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vm.fetchListPokemon()
        vm.addPokemon(Pokemon(0L,"Pikachu",60,50,Type.ELEC))
        vm.addPokemon(Pokemon(0L,"Carapuce",70,20,Type.EAU))
    }
}