package com.tecsup.practica2.Vistas.Marco

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tecsup.practica2.R

class MarcoViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_marco, parent, false)) {

    private var imgMarco: ImageView? = null
    private var textMarcoTitle: TextView? = null
    private var textMarcoCategory: TextView? = null
    private var textMarcoPrice: TextView? = null
    private var textMarcoDescription: TextView? = null

    init {
        imgMarco = itemView.findViewById(R.id.imgMarco)
        textMarcoTitle = itemView.findViewById(R.id.textMarcoTitle)
        textMarcoCategory = itemView.findViewById(R.id.textMarcoCategory)
        textMarcoPrice = itemView.findViewById(R.id.textMarcoPrice)
        textMarcoDescription = itemView.findViewById(R.id.textMarcoDescription)
    }

    fun bind(Marco: Marco) {
        textMarcoTitle?.text = Marco.title
        textMarcoCategory?.text = Marco.category
        textMarcoPrice?.text = Marco.price
        textMarcoDescription?.text = Marco.description
        imgMarco?.setImageResource(Marco.image)
    }
}