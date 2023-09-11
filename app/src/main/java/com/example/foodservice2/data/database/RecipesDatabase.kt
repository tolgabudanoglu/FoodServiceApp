package com.example.foodservice2.data.database



import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.foodservice2.data.database.entity.FavoritesEntity
import com.example.foodservice2.data.database.entity.FoodJokeEntity
import com.example.foodservice2.data.database.entity.RecipesEntity

@Database(
    entities = [RecipesEntity::class, FavoritesEntity::class,FoodJokeEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase: RoomDatabase() {

    abstract fun recipesDao(): RecipesDao

}