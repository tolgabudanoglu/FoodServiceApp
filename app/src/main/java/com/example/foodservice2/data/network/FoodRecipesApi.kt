package com.example.foodservice2.data.network

import com.example.foodservice2.models.FoodJoke
import com.example.foodservice2.models.FoodRecipes
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

import retrofit2.http.QueryMap


interface FoodRecipesApi {

    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap queries: Map<String,String>
    ): Response<FoodRecipes>

    @GET("/recipes/complexSearch")
    suspend fun searcRecipes(
        @QueryMap searchQuery: Map<String, String>
    ):Response<FoodRecipes>

    @GET("food/jokes/random")
    suspend fun getFoodJoke(
        @Query("apiKey") apiKey: String
    ): Response<FoodJoke>

}