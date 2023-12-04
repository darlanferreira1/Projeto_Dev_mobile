package com.example.projeto_mobile.mainFragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projeto_mobile.Others.Adapter
import com.example.projeto_mobile.R
import com.example.projeto_mobile.databinding.FragmentInicioBinding
import com.example.projeto_mobile.ui.MapsActivity
import com.example.projeto_mobile.ui.PessoaActivity



class InicioFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentInicioBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        _binding = FragmentInicioBinding.inflate(inflater, container, false)
        //binding botao dentro da navbar
        setupLocalButtonClickListener()
        initReclycerView()
        return binding.root
    }

    override fun onClick(elemento: View) {
        if(elemento.id == R.id.button_local){
            // TODO:
        }
    }

    private fun setupLocalButtonClickListener() {
        binding.topToolbar.findViewById<Button>(R.id.button_local).setOnClickListener {
            handleLocalButton()
        }
    }
    private fun initReclycerView(){
        binding.recyclerSellers.layoutManager = LinearLayoutManager(context)
        binding.recyclerSellers.setHasFixedSize(true) /*gera melhor performance na recycler view*/

        binding.recyclerSellers.adapter = Adapter() {nome, descricao, local ->
            val intent = Intent(requireContext(), PessoaActivity::class.java)
                intent.putExtra("nome", nome)
                intent.putExtra("descricao", descricao)
                intent.putExtra("local", local)

            startActivity(intent)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun handleLocalButton(){
        val intent = Intent(requireContext(), MapsActivity::class.java)
        startActivity(intent)
    }




}