package com.cowok.hijrah.chapter6topic4.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cowok.hijrah.chapter6topic4.R
import com.cowok.hijrah.chapter6topic4.model.getAllCarItem
import kotlinx.android.synthetic.main.item_car.view.*

class CarAdapter(var listCar: List<getAllCarItem>): RecyclerView.Adapter<CarAdapter.ViewHolder>(){
    class ViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_car, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.carName.text = listCar[position].name
        holder.itemView.carCreate.text = listCar[position].createdAt
        Glide.with(holder.itemView.context).load(listCar[position].image).into(holder.itemView.carImage)
    }

    override fun getItemCount(): Int {
        return listCar.size
    }
}