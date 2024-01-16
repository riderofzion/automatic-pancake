package com.example.mod9d01

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Pokemon(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
    val name : String,
    @ColumnInfo(name = "health_points")
    val hp : Int,
    @ColumnInfo(name = "power_attack")
    val pa : Int,
    val type : Type,
)
