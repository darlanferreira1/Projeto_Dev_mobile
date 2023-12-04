package com.example.projeto_mobile.mainFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projeto_mobile.Others.MockUPs
import com.example.projeto_mobile.Others.PerfilAdapter
import com.example.projeto_mobile.databinding.FragmentPerfilBinding

class PerfilFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentPerfilBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPerfilBinding.inflate(inflater, container, false)

        initRecyclerView()

        return binding.root
    }

    private fun initRecyclerView(){
        // Configurar a RecyclerView usando View Binding
        val adapter = PerfilAdapter(MockUPs().getOpcoesPerfil()) // Certifique-se de obter seus dados
        binding.recyclerProfile.adapter = adapter
        binding.recyclerProfile.layoutManager = LinearLayoutManager(context)
    }

    override fun onClick(elemento: View?) {
        // TODO:
    }


}