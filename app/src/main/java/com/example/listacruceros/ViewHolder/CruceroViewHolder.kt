package com.example.listacruceros.ViewHolder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listacruceros.Models.Crucero
import com.example.listacruceros.R

class CruceroViewHolder(view: View) :RecyclerView.ViewHolder(view){
    val name = view.findViewById<TextView>(R.id.tvName)
    val description = view.findViewById<TextView>(R.id.tvDescription)
    var imgC: ImageView = view.findViewById(R.id.imgCrucero)
    val context = view.context

    fun render(crucero: Crucero){
        name.text = crucero.name
        description.text = crucero.description
        Glide.with(context).load(crucero.img).into(imgC)
    }
}