package com.example.mod9d01

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PokedexTest {
    lateinit var pokedex: PokemonDB
    @Before
    fun getDb(){
        pokedex = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            PokemonDB::class.java
        ).build()
    }
    @Test
    fun testInsertPikachu() {
        val pikachuId = pokedex.pokemonDao().insert(
            Pokemon(0L,"Pikachu",60,50,Type.ELEC)
        )
        assertTrue(pokedex.pokemonDao().getById(pikachuId).name.equals("Pikachu"))
    }
}