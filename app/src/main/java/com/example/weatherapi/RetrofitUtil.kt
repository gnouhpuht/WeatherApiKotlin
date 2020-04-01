package com.example.weatherapi

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitUtil {
    private val retrofit: Retrofit? = null
    private var api: ApiService? = null
    private val baseUrl: String ="https://samples.openweathermap.org/data/2.5/"
    fun getApi(): ApiService? {
        val gson = GsonBuilder().setLenient().create()
        if (api == null) {

            val builder = Retrofit.Builder()
            builder.baseUrl(baseUrl)
            builder.addConverterFactory(GsonConverterFactory.create(gson))
            val retrofit = builder.build()
            api = retrofit.create(ApiService::class.java)
        }
        return api
    }
}