package com.example.foodservice2.util

class Constants {

    companion object{
        const val BASE_URL = "https://api.spoonacular.com"
        const val API_KEY = "88514b466f254dd6b962b028dab7db54"

        // API Query Keys
        const val QUERY_NUMBER = "number"
        const val QUERY_API_KEY = "apiKey"
        const val QUERY_TYPE = "type"
        const val QUERY_DIET = "diet"
        const val QUERY_ADD_RECIPE_INFORMATION = "addRecipeInformation"
        const val QUERY_FILL_INGREDIENTS = "fillIngredients"


        const val DATABASE_NAME = "recipes_database"
        const val RECIPES_TABLE = "recipes_table"

        const val DEFAULT_MEAL_TYPE="main course"
        const val DEFAULT_DIET_TYPE="gluten free"
        const val DEFAULT_RECIPES_NUMBER="50"

        const val PREFERENCES_NAME = "foodcu preference"
        const val PREFERENCES_MEAL_TYPE = "mealType"
        const val PREFERENCES_MEAL_TYPE_ID = "mealTypeId"
        const val PREFERENCES_DIET_TYPE = "dietType"
        const val PREFERENCES_DIET_TYPE_ID = "dietTypeId"


    }
}