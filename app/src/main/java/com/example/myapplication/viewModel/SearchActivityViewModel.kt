package com.example.myapplication.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.myapplication.repository.SearchActivityRepository

class SearchActivityViewModel(application: Application): AndroidViewModel(application) {

    val respository= SearchActivityRepository(application)
    val showProgress : LiveData<Boolean>

    init {
        this.showProgress= respository.showProgress
    }

    fun changeState()
    {
        respository.changeState()
    }
}