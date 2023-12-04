package com.example.projeto_mobile.Others

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projeto_mobile.R

class PerfilAdapter(private val opcoes: List<String>): RecyclerView.Adapter<PerfilAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.perifl_itens, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(opcoes[position])

    }

    override fun getItemCount(): Int {
        return opcoes.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.perfil_option)

        fun bind(opcao: String) {
            textView.text = opcao
        }
    }
}