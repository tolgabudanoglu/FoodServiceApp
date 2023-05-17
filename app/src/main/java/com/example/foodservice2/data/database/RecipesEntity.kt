package com.example.foodservice2.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.foodservice2.util.Constants.Companion.RECIPES_TABLE
import com.example.foodservice2.models.FoodRecipes


@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipes
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}