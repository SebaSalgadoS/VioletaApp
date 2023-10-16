package com.example.violeta.data.model.retrofit

import com.google.gson.annotations.SerializedName

data class ResponseApi(
    @SerializedName("category") val category: Int
)