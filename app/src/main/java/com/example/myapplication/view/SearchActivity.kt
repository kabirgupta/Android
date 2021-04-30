package com.example.myapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.viewModel.SearchActivityViewModel

class SearchActivity : AppCompatActivity() {

    private lateinit var viewModel: SearchActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        viewModel= ViewModelProvider(this).get(SearchActivityViewModel::class.java)

        viewModel.showProgress.observe(this, Observer {

        })
    }
}