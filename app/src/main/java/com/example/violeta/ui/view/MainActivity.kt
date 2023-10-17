package com.example.violeta.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.violeta.ui.viewmodel.MainViewModel
import com.example.violeta.data.model.retrofit.DataAPI
import com.example.violeta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initObservable()
        binding.buttonMole.setOnClickListener {
            initViewModel(binding.inputMole.toString())
            Log.i("INPUT VALUE", binding.inputMole.toString())
        }

    }

    private fun initObservable() {
        viewModel.respositoryModel.observe(this) {
            binding.textMole.text = it.text
        }
    }

    private fun initViewModel(text: String) {
        val text2 = DataAPI(text)
        viewModel.getText(text2)
    }
}