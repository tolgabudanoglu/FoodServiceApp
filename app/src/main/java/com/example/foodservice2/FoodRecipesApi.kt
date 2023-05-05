package com.example.foodservice2

import com.example.foodservice2.models.FoodRecipes

import retrofit2.http.GET
import retrofit2.http.QueryMap


interface FoodRecipesApi {

    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap queries: Map<String,String>
    ):retrofit2.Response<FoodRecipes>

}