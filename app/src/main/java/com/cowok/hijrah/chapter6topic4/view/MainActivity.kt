package com.cowok.hijrah.chapter6topic4.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.cowok.hijrah.chapter6topic4.R
import com.cowok.hijrah.chapter6topic4.model.getAllCarItem
import com.cowok.hijrah.chapter6topic4.presenter.CarPresenter
import com.cowok.hijrah.chapter6topic4.presenter.CarView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CarView {
    private lateinit var presenterCar: CarPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenterCar = CarPresenter(this)
        presenterCar.getDataNews()
    }

    override fun onSuccess(pesan: String, car: List<getAllCarItem>) {
        rvCar.layoutManager = LinearLayoutManager(this)
        rvCar.adapter = CarAdapter(car)
    }

    override fun onError(pesan: String) {
        Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show()
    }
}