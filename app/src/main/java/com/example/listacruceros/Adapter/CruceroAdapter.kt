package com.example.listacruceros.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listacruceros.Models.Crucero
import com.example.listacruceros.R
import com.example.listacruceros.ViewHolder.CruceroViewHolder

class CruceroAdapter(private val listCrucero: ArrayList<Crucero>) : RecyclerView.Adapter<CruceroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CruceroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_cruceros, parent, false)
        return CruceroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCrucero.size
    }

    override fun onBindViewHolder(holder: CruceroViewHolder, position: Int) {
        holder.render(listCrucero[position])
    }

}