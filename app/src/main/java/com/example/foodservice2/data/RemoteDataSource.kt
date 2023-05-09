package com.example.foodservice2.data

import com.example.foodservice2.data.network.FoodRecipesApi
import com.example.foodservice2.models.FoodRecipes
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipes> {
        return foodRecipesApi.getRecipes(queries)
    }
}