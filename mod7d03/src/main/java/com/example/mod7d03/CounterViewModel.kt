package com.example.mod7d03

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

private const val TAG = "CounterViewModel"
@HiltViewModel
class CounterViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val counterRepositoryTest: CounterRepositoryTest) : ViewModel() {
    var counter = MutableLiveData(counterRepositoryTest.counterRepo)

    fun inc() {
        Log.i(TAG, "inc: je suis incrémenté $counter ")
        counter.value = counter.value?.inc()
    }
}