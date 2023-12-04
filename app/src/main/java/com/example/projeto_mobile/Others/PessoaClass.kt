package com.example.projeto_mobile.Others

import com.google.android.gms.maps.model.LatLng

data class PessoaClass(
    val nome: String,
    val descricao: String,
    val servicos: List<String>,
    val local: LatLng,
    val contatos: List<String>,
    val sociais: List<String>,
    val email: String,
    val senha: String,
) {

}