package com.example.foodservice2


import com.google.gson.annotations.SerializedName

data class FoodRecipes(

    @SerializedName("results")
    val results: List<Result>,

)