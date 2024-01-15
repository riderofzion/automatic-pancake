package com.example.mod7d03

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

private const val TAG = "CounterViewModel"
class CounterViewModel : ViewModel() {
    var counter = MutableLiveData(0)

    fun inc() {
        Log.i(TAG, "inc: je suis incrémenté $counter ")
        counter.value = counter.value?.inc()
    }
}