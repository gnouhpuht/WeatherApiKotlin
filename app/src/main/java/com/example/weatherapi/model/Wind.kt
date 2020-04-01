package com.example.weatherapi.model

import com.google.gson.annotations.SerializedName

class Wind {
    @SerializedName("speed")
    var speed: Float =0f
    @SerializedName("deg")
    var deg: Int = 0

}