package com.example.mod6d01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonToTarget)
        button.setOnClickListener {
            val intent = Intent(this, TargetActivity::class.java)
            intent.putExtra("temperature", 5)
            startActivity(intent)
            //autre syntaxe possible avec kotlin
//            Intent(this, TargetActivity::class.java).also {
//                startActivity(it)
//            }
        }

    }
}