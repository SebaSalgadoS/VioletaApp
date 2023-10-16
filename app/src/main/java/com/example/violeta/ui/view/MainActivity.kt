package com.example.violeta.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.violeta.ui.viewmodel.MainViewModel
import com.example.violeta.data.model.retrofit.DataAPI
import com.example.violeta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initObservable()
        binding.buttonMole.setOnClickListener{
            val text4 = binding.inputMole.toString()
            initViewModel(text4)
        }

    }

    private fun initObservable(){
        viewModel.respositoryModel.observe(this, Observer {
            binding.inputMole.toString()
        } )
    }
    private fun initViewModel(text : String){
        val text2 = DataAPI(text)
        viewModel.getText(text2)
    }
}