package com.example.projeto_mobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.projeto_mobile.Data.ToyBox
import com.example.projeto_mobile.databinding.FragmentInicioBinding
import com.example.projeto_mobile.R


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
        val tvToyName = binding.tvToyNames
        val toyNames = ToyBox.getToyNames()
        toyNames.forEach {
            tvToyName.append("${it}\n\n\n")
        }
        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}