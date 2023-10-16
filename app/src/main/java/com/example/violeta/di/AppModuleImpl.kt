package com.example.violeta.di

import android.content.Context
import com.example.violeta.domain.ApiUseCase
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "http://54.198.38.242:5000"
class AppModuleImpl(private val appContext: Context) : AppModule {

    override val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL + "/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}

