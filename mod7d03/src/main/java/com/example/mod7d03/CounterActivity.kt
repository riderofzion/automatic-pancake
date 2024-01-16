package com.example.mod7d03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mod7d03.databinding.ActivityCounterBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CounterActivity : AppCompatActivity() {
    private val vm by viewModels<CounterViewModel>()
    lateinit var binding : ActivityCounterBinding

    //var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_counter)
        binding.vm = vm
        binding.lifecycleOwner = this
        //val textViewCounter = findViewById<TextView>(R.id.textViewCounter)
        //val buttonInc = findViewById<Button>(R.id.buttonInc)

        //binding.textViewCounter.text = "${vm.counter}"
        //binding.buttonInc.setOnClickListener {binding.textViewCounter.text = "${vm.inc()}" }
    }

    //override fun onSaveInstanceState(outState: Bundle) {
    //    super.onSaveInstanceState(outState)
    //    outState.putInt("counter",counter)
    //}
//
    //override fun onRestoreInstanceState(savedInstanceState: Bundle) {
    //    super.onRestoreInstanceState(savedInstanceState)
    //    counter = savedInstanceState.getInt("counter")
    //    val textViewCounter = findViewById<TextView>(R.id.textViewCounter)
    //    textViewCounter.text = "$counter"
    //}
}