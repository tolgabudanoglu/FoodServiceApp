package com.example.foodservice2.ui.fragments.overview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import coil.load
import com.example.foodservice2.R
import com.example.foodservice2.bindingAdapters.RecipesRowBinding
import com.example.foodservice2.databinding.FragmentOverviewBinding
import com.example.foodservice2.models.Result
import com.example.foodservice2.util.Constants.Companion.RECIPE_RESULT_KEY
import com.example.foodservice2.util.retrieveParcelable
import org.jsoup.Jsoup


class OverviewFragment : Fragment() {
    private var _binding: FragmentOverviewBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentOverviewBinding.inflate(inflater, container, false)

        val args = arguments
        val myBundle: Result? = args!!.retrieveParcelable(RECIPE_RESULT_KEY) as Result?

        if (myBundle != null) {
            binding.mainImageView.load(myBundle.image)
            binding.tvTittle.text = myBundle.title
            binding.tvLikes.text = myBundle.aggregateLikes.toString()
            binding.tvTime.text = myBundle.readyInMinutes.toString()
            myBundle.summary.let {
                val summary = Jsoup.parse(it).text()
                binding.summaryTextView.text=summary
            }

            updateColors(
                myBundle.vegetarian,
                binding.tvVegetarian,
                binding.ivVegetarian
            )
            updateColors(myBundle.vegan, binding.tvVegan, binding.ivVegan)
            updateColors(myBundle.cheap, binding.tvCheap, binding.ivCheap)
            updateColors(myBundle.dairyFree, binding.tvDairyFree, binding.ivDairyFree)
            updateColors(
                myBundle.glutenFree,
                binding.tvGlutenFree,
                binding.ivGlutenFree
            )
            updateColors(myBundle.veryHealthy, binding.tvHealthy, binding.ivHealthy)
        }

        return binding.root
    }
    private fun updateColors(stateIsOn: Boolean, textView: TextView, imageView: ImageView) {
        if (stateIsOn) {
            imageView.setColorFilter(ContextCompat.getColor(requireContext(),R.color.green))
            textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.green))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}