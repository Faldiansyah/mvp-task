package com.cowok.hijrah.chapter6topic4.presenter

import com.cowok.hijrah.chapter6topic4.model.getAllCarItem

interface CarView {
    fun onSuccess(pesan: String, car: List<getAllCarItem>)
    fun onError(pesan: String)
}