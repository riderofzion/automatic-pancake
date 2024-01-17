package com.example.mod11webservice

data class Movie(
    val title :String,
    val year: Int,
    val rank: Int,
    val aka : String,
    val imdbUrl: String,
    //All Images attributes
    val imgPoster: String,
    val imgPosterWidth: Int,
    val imgPosterHeight: Int,
    //val img : Triple<String, Int, Int>
)
