package com.example.projeto_mobile.loginFragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projeto_mobile.R
import com.example.projeto_mobile.databinding.FragmentSplashArtBinding

class SplashArtFragment : Fragment() {

    private var _binding: FragmentSplashArtBinding? = null
    private val binding get() = _binding!!

    //private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSplashArtBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler(Looper.getMainLooper()).postDelayed(this::checkAuth, 3000)

    }

    private fun checkAuth() {
        findNavController().navigate(R.id.action_splashArtFragment_to_loginFragment)

    /*auth = Firebase.auth
        if (auth.currentUser == null) {
            findNavController().navigate(R.id.action_splashFragment_to_authentication)
        } else {
            findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
        }*/
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}