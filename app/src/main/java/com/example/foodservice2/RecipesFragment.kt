package com.example.foodservice2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foodservice2.databinding.FragmentRecipesBinding
import com.facebook.shimmer.ShimmerFrameLayout

class RecipesFragment : Fragment() {


    private var _binding: FragmentRecipesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRecipesBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.shimmerFrameLayout.startShimmer()






        return view
    }

}


