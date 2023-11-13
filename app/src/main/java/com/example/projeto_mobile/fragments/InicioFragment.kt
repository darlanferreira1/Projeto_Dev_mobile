package com.example.projeto_mobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projeto_mobile.Others.Adapter
import com.example.projeto_mobile.databinding.FragmentInicioBinding


class InicioFragment : Fragment() {

    private var _binding: FragmentInicioBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        _binding = FragmentInicioBinding.inflate(inflater, container, false)
        initReclycerView()
        return binding.root
    }


    private fun initReclycerView(){
        binding.recyclerSellers.layoutManager = LinearLayoutManager(context)
        binding.recyclerSellers.setHasFixedSize(true) /*gera melhor performance na recycler view*/
        binding.recyclerSellers.adapter = Adapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}