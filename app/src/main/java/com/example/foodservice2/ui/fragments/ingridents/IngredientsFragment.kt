package com.example.foodservice2.ui.fragments.ingridents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodservice2.R
import com.example.foodservice2.adapters.IngredientsAdapter
import com.example.foodservice2.databinding.FragmentIngredientsBinding
import com.example.foodservice2.util.Constants.Companion.RECIPE_RESULT_KEY
import com.example.foodservice2.util.retrieveParcelable


class IngredientsFragment : Fragment() {

    private val mAdapter: IngredientsAdapter by lazy { IngredientsAdapter() }

    private var _binding: FragmentIngredientsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentIngredientsBinding.inflate(inflater, container, false)

        val args = arguments
        val myBundle: com.example.foodservice2.models.Result? = args!!.retrieveParcelable(RECIPE_RESULT_KEY) as com.example.foodservice2.models.Result?

        setupRecyclerView()
        myBundle?.extendedIngredients?.let { mAdapter.setData(it) }

        return binding.root
    }

    private fun setupRecyclerView() {
        binding.rvIngridents.adapter = mAdapter
        binding.rvIngridents.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}