package com.example.mod4tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mod4tp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val list = mutableListOf<Quizz>()
    var index = 0
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //récupération du binding, autre façon
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        list.add(Quizz("Est-ce que ça va ?", true))
        list.add(Quizz("Est-ce qu'il neige demain ?", false))
        list.add(Quizz("Est-ce que la terre est plate ?", true))

        binding.quizz = list[index]
        binding.score = score

        binding.buttonTrue.setOnClickListener {
            if(list[index].answer){
                binding.score = ++score
            }
            onButtonClick()
        }

        binding.buttonFalse.setOnClickListener {
            if(!list[index].answer){
                binding.score = ++score
            }
            onButtonClick()
        }
    }

    fun onButtonClick() {
        index++
        if(index < list.size){
            binding.quizz = list[index]
        }else{
            binding.buttonTrue.isEnabled = false
            binding.buttonFalse.isEnabled = false

        }
    }
}