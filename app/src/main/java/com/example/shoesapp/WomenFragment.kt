package com.example.shoesapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shoesapp.adapter.MenShoesAdapter
import com.example.shoesapp.adapter.WomenShoesAdapter
import com.example.shoesapp.data.DataSource
import com.example.shoesapp.databinding.FragmentWomenBinding

class WomenFragment : Fragment() {
    private var binding: FragmentWomenBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = FragmentWomenBinding.inflate(inflater, container, false)
        binding = fragmentBinding

        val myDataSet = DataSource().loadWomenShoes()
        binding?.recyclerView?.adapter = WomenShoesAdapter(this, myDataSet)
        binding?.recyclerView?.setHasFixedSize(true)

        return fragmentBinding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}