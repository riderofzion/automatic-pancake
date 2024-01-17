package com.example.mod11webservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.json.JSONObject
import java.io.IOException

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    private val client = OkHttpClient()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val requestSW = Request.Builder()
            //.url("https://search.imdbot.workers.dev/?q=Star%20Wars")
            .url(getString(R.string.baseUrl))
            .build()
        client.newCall(requestSW).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.e(TAG, "onFailure: ", )
            }

            override fun onResponse(call: Call, response: Response) {
                //Log.i(TAG, "onResponse: ${response.body?.string()}")
                response.body?.let {
                    deserializeResponse(it.string())
                }
            }

        })
    }
    fun deserializeResponse(responseBody: String) : List<Movie>{
        val arrayListMovies = arrayListOf<Movie>()
        val responseJSON: JSONObject = JSONObject(responseBody)
        val arrayMoviesJSON = responseJSON.getJSONArray("description")
        for(movieJSONIndex in 0 until arrayMoviesJSON.length()){
            val movieJSON = arrayMoviesJSON.getJSONObject(movieJSONIndex)
            arrayListMovies.add(
                Movie(
                    movieJSON.getString("#TITLE"),
                    movieJSON.getInt("#YEAR"),
                    movieJSON.getInt("#RANK"),
                    movieJSON.getString("#AKA"),
                    movieJSON.getString("#IMDB_URL"),
                    movieJSON.getString("#IMG_POSTER"),
                    movieJSON.getInt("photo_width"),
                    movieJSON.getInt("photo_height"),
                ))
        }
        return arrayListMovies
    }
}