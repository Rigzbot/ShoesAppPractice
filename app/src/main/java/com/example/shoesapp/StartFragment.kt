package com.example.shoesapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.shoesapp.databinding.FragmentStartBinding

class StartFragment : Fragment() {
    private var binding: FragmentStartBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = FragmentStartBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.startFragment = this
    }

    fun goToMens() {
        findNavController().navigate(R.id.action_startFragment_to_menFragment)
    }

    fun goToWomen() {
        findNavController().navigate(R.id.action_startFragment_to_womenFragment)
    }

    fun goToKids() {
        findNavController().navigate(R.id.action_startFragment_to_kidsFragment)
    }

    fun goToCart() {
        findNavController().navigate(R.id.action_startFragment_to_cartFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}