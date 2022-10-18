package com.cowok.hijrah.chapter6topic4.network

import com.cowok.hijrah.chapter6topic4.model.getAllCarItem
import retrofit2.Call
import retrofit2.http.GET

interface RestfullApiCar {
    @GET("admin/car")
    fun getAllCar(): Call<List<getAllCarItem>>
}