package com.example.mod4d02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mod4d02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //permet une initialisation tardive
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.textViewHello.text = binding.editText.text.toString()
        }


    }
}