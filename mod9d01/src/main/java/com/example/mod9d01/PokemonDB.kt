package com.example.mod9d01

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [Pokemon::class], version = 1, exportSchema = false)
abstract class PokemonDB : RoomDatabase() {
    abstract fun pokemonDao() : PokemonDao

    companion object{
        private var INSTANCE : PokemonDB? = null
        fun getInstance(context: Context):PokemonDB{
            var instance = INSTANCE
            if(instance == null){
                instance = Room.databaseBuilder(
                    context, PokemonDB::class.java,"pokedex"
                ).fallbackToDestructiveMigration().build()
            }
            return instance;
        }
    }
}