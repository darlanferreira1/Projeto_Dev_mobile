package com.example.projeto_mobile.Others

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projeto_mobile.R
import com.example.projeto_mobile.databinding.IncioItensBinding
import com.google.android.gms.maps.model.LatLng

class Adapter(

    val nameSelected: (String,String,LatLng) -> Unit

): RecyclerView.Adapter<Adapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = IncioItensBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val pessoa = (MockUPs().getPessoas()[position])


        holder.textName.text = pessoa.nome


        //evento de click
        holder.itemView.setOnClickListener{nameSelected(pessoa.nome,pessoa.descricao,pessoa.local)}
    }

    override fun getItemCount() = MockUPs().getPessoas().size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textName: TextView = itemView.findViewById(R.id.seller_name)
    }

}
