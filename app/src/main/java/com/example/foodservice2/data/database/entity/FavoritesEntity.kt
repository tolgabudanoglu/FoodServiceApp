package com.example.foodservice2.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.foodservice2.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result:com.example.foodservice2.models.Result
)