package com.example.foodservice2.data

import com.example.foodservice2.data.network.FoodRecipesApi
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
    suspend fun getRecipes(queries: Map<String,String>) {
        foodRecipesApi.getRecipes(queries)
    }
}