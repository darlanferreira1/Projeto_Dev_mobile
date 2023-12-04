package com.example.projeto_mobile.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.projeto_mobile.R
import com.example.projeto_mobile.databinding.ActivityMainBinding
import com.example.projeto_mobile.databinding.ActivityPessoaBinding
import com.google.android.gms.maps.model.LatLng

class PessoaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPessoaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPessoaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nome = intent.getStringExtra("nome")
        val nomeTextView = findViewById<TextView>(R.id.pessoa_name)
        nomeTextView.text = nome

        val descricao = intent.getStringExtra("descricao")
        val descricaoTextView = findViewById<TextView>(R.id.pessoa_desc)
        descricaoTextView.text = descricao

        val localizacao = intent.getParcelableExtra<LatLng>("localizacao")
        val localizacaoTextView = findViewById<TextView>(R.id.pessoa_localization)
        val formattedLatLng = "Latitude: ${localizacao?.latitude}, Longitude: ${localizacao?.longitude}"
        localizacaoTextView.text = formattedLatLng


    }
}