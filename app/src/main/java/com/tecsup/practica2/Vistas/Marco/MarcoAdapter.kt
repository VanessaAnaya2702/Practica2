package com.tecsup.practica2.Vistas.Marco


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class MarcoAdapter(val list: List<Marco>): RecyclerView.Adapter<MarcoViewHolder>(){

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarcoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MarcoViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MarcoViewHolder, position: Int) {
        val rest = list[position]
        holder.bind(rest)
    }


}