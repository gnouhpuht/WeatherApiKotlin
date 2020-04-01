package com.example.weatherapi

import com.example.weatherapi.model.Data
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("weather")
    fun getListData(@Query("q") q: String, @Query("appid") apiid: String): Call<Data>
}