package com.example.projeto_mobile.Others

import com.google.android.gms.maps.model.LatLng

class MockUPs {

    fun getPessoas(): List<PessoaClass> {
        return listOf(
            PessoaClass(
                "João Silva",
                "Pintor Experiente",
                listOf("Serviço 1", "Serviço 2"),
                LatLng(-23.550520, -46.633307),
                listOf("123-456-7890", "joao.silva@email.com"),
                listOf("linkedin.com/in/joao", "twitter.com/joao_silva"),
                "joao.silva@email.com",
                "senha123"
            ),
            PessoaClass(
                "Maria Silva",
                "Encanadora Experiente",
                listOf("Serviço 4", "Serviço 8"),
                LatLng(-23.550520, -46.633307),
                listOf("123-456-7890", "joao.silva@email.com"),
                listOf("linkedin.com/in/joao", "twitter.com/joao_silva"),
                "joao.silva@email.com",
                "senha123"
            ),
            PessoaClass(
                "Mario Silva",
                "Pintor Experiente",
                listOf("Serviço 1", "Serviço 2"),
                LatLng(-23.550520, -46.633307),
                listOf("123-456-7890", "joao.silva@email.com"),
                listOf("linkedin.com/in/joao", "twitter.com/joao_silva"),
                "joao.silva@email.com",
                "senha123"
            ),
            PessoaClass(
                "Carlos Silva",
                "Pintor Experiente",
                listOf("Serviço 1", "Serviço 2"),
                LatLng(-23.550520, -46.633307),
                listOf("123-456-7890", "joao.silva@email.com"),
                listOf("linkedin.com/in/joao", "twitter.com/joao_silva"),
                "joao.silva@email.com",
                "senha123"
            ),
            // Adicione mais instâncias de Pessoa conforme necessário
        )
    }



    fun getOpcoesPerfil(): List<String>{
        return listOf(
            "Segurança",
            "Conversas",
            "Notificações",
            "Pagamentos",
            "Ajuda",
            "Configurações",
            "Endereços"
        )
    }
}