package com.example.projeto_mobile.Others

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projeto_mobile.R
import com.example.projeto_mobile.databinding.IncioItensBinding

class Adapter(): RecyclerView.Adapter<Adapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = IncioItensBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val name = MockUPs().getNomes()[position]
        holder.textName.text = name
    }

    override fun getItemCount() = MockUPs().getNomes().size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textName: TextView = itemView.findViewById(R.id.seller_name)
    }

}
