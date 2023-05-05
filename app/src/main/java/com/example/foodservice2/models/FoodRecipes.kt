package com.example.foodservice2.models


import com.example.foodservice2.models.Result
import com.google.gson.annotations.SerializedName

data class FoodRecipes(

    @SerializedName("results")
    val results: List<Result>,

    )