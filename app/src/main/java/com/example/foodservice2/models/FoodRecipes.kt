package com.example.foodservice2.models



import com.google.gson.annotations.SerializedName

data class FoodRecipes(

    @SerializedName("results")
    val results: List<Result>,

    )