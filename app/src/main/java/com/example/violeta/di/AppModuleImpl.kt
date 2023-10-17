package com.example.violeta.di

import com.example.violeta.data.ServiceVioleta
import com.example.violeta.domain.ApiUseCase
import com.example.violeta.ui.viewmodel.MainViewModel
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "http://54.198.38.242:5000/"
val AppModuleImpl = module {

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
            .create(ServiceVioleta::class.java)
    }

    single {
        ApiUseCase(get())
    }

    single {
        MainViewModel(get())
    }

    single {
        OkHttpClient.Builder().build()
    }

}

