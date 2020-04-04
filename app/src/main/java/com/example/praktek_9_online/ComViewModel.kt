package com.example.praktek_9_online

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ComViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    val name: LiveData<String>
        get() = mName
    fun setName(name: String) {
        mName.value = name
    }
}