package com.example.foodservice2.ui.fragments.instructions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.example.foodservice2.R
import com.example.foodservice2.databinding.FragmentInstructionsBinding
import com.example.foodservice2.models.Result
import com.example.foodservice2.util.Constants
import com.example.foodservice2.util.retrieveParcelable


class InstructionsFragment : Fragment() {


    private var _binding: FragmentInstructionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentInstructionsBinding.inflate(inflater, container, false)

        val args = arguments
        val myBundle: Result? = args!!.retrieveParcelable(Constants.RECIPE_RESULT_KEY) as Result?

        if (myBundle != null) {
            binding.wvInstructions.webViewClient = object : WebViewClient() {}
            val websiteUrl: String = myBundle.sourceUrl
            binding.wvInstructions.loadUrl(websiteUrl)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}