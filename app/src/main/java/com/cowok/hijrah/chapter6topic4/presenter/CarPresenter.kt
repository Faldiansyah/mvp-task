package com.cowok.hijrah.chapter6topic4.presenter

import com.cowok.hijrah.chapter6topic4.model.getAllCarItem
import com.cowok.hijrah.chapter6topic4.network.RetrofitCar
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CarPresenter(val viewcar: CarView) {
    fun getDataNews(){
        RetrofitCar.instance.getAllCar()
            .enqueue(object : Callback<List<getAllCarItem>>{
                override fun onResponse(
                    call: Call<List<getAllCarItem>>,
                    response: Response<List<getAllCarItem>>
                ) {
                    if (response.isSuccessful){
                        viewcar.onSuccess(response.message(), response.body()!!)
                    } else {
                        viewcar.onError(response.message())
                    }
                }

                override fun onFailure(call: Call<List<getAllCarItem>>, t: Throwable) {
                    viewcar.onError(t.message!!)
                }

            })

    }
}