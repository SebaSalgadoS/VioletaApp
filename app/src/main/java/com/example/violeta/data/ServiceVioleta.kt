package com.example.violeta.data

import com.example.violeta.data.model.retrofit.DataAPI
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ServiceVioleta {

    @POST()
    suspend fun sendMole(@Body user: DataAPI?): Call<DataAPI?>?

}