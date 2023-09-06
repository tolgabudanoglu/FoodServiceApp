package com.example.foodservice2.data.database

import androidx.room.TypeConverter
import com.example.foodservice2.models.FoodRecipes
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class RecipesTypeConverter {
    private var gson = Gson()

    @TypeConverter
    fun foodRecipeToString(foodRecipe: FoodRecipes): String {
        return gson.toJson(foodRecipe)
    }

    @TypeConverter
    fun stringToFoodRecipe(data: String): FoodRecipes {
        val listType = object : TypeToken<FoodRecipes>() {}.type
        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun resulToString(result: com.example.foodservice2.models.Result):String{
        return gson.toJson(result)
    }
    @TypeConverter
    fun stringToResult(data: String):com.example.foodservice2.models.Result{
        val listType = object : TypeToken<com.example.foodservice2.models.Result>() {}.type
        return gson.fromJson(data,listType)
    }

}