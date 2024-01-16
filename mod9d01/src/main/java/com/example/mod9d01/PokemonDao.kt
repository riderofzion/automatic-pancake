package com.example.mod9d01

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PokemonDao {
    @Insert
    fun insert(pokemon: Pokemon): Long

    @Query("SELECT * FROM Pokemon WHERE id = :id")
    fun getById(id: Long): Pokemon

    @Query("SELECT * FROM Pokemon")
    fun getAll() : List<Pokemon>

    @Update()
    fun update(pokemon : Pokemon)
    @Delete()
    fun delete(pokemon : Pokemon)

}