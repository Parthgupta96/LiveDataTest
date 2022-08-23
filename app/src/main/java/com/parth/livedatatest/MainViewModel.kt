package com.parth.livedatatest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val liveData = MutableLiveData<String>("Random value")

    init {

    }
}