package com.example.foodservice2.data


import com.example.foodservice2.data.network.FoodRecipesApi
import com.example.foodservice2.models.FoodJoke
import com.example.foodservice2.models.FoodRecipes
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipes> {
        return foodRecipesApi.getRecipes(queries)
    }

    suspend fun searchRecipes(searchQuery:Map<String,String>):Response<FoodRecipes>{
        return foodRecipesApi.searcRecipes(searchQuery)
    }

    suspend fun getFoodJoke(apiKey: String): Response<FoodJoke> {
        return foodRecipesApi.getFoodJoke(apiKey)
    }
}