package com.example.weatherapi.model

import com.google.gson.annotations.SerializedName

class Data {
    var coord: Coord = Coord()
    var weatherLisst: ArrayList<Weather> = ArrayList()
    @SerializedName("base")
    var base: String = ""
    var wind: Wind = Wind()
    @SerializedName("id")
    var id: String = ""
    @SerializedName("name")
    var name: String = ""
    @SerializedName("cod")
    var cod: String = ""
    @SerializedName("dt")
    var dt: String = ""
}