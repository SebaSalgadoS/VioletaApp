package com.example.violeta.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.violeta.data.model.retrofit.DataAPI
import com.example.violeta.domain.ApiUseCase
import kotlinx.coroutines.launch

class MainViewModel(private val apiUseCase: ApiUseCase) : ViewModel() {

    val respositoryModel = MutableLiveData<DataAPI>()

    fun getText(text: DataAPI) {
        viewModelScope.launch {
            respositoryModel.postValue(text)
            println("Se devolvió el dato")
        }

    }

}