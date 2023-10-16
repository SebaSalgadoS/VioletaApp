package com.example.violeta.app

import android.app.Application
import com.example.violeta.data.ServiceVioleta
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class VioletaApplication : Application() {

    val retrofit by lazy {
        Retrofit.Builder().baseUrl("http://54.198.38.242:5000").addConverterFactory(GsonConverterFactory.create()).build()
    }

    val violetaApiService by lazy {
        retrofit.create(ServiceVioleta::class.java)
    }
}