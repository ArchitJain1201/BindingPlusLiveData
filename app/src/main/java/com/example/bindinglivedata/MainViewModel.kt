package com.example.bindinglivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val quoteLiveData = MutableLiveData("what you give is what you get")

    fun updateQuote(){
        quoteLiveData.value = " You'll See it when you believe it. "
    }
}