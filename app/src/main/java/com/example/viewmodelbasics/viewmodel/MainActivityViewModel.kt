package com.example.viewmodelbasics.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var number = 0
    fun addNumber() {
        number++
    }

}