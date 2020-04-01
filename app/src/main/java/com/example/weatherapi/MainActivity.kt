package com.example.weatherapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.weatherapi.model.Data
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData()
    }

    private fun getData() {
        RetrofitUtil.getApi()!!.getListData("london", "b6907d289e10d714a6e88b30761fae22")
            .enqueue(object : Callback<Data> {
                override fun onResponse(call: Call<Data>, response: Response<Data>) {
                    Log.i("rrrrrrrrrrrrr", "onResponse: link " + call.request().toString())
                    name.setText(response.body()!!.name)
                }

                override fun onFailure(call: Call<Data>, t: Throwable) {

                }
            })
    }
}
