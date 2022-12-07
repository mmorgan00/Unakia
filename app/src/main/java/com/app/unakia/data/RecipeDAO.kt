package com.app.unakia.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RecipeDAO {
    @Insert
    fun insert(item : Recipe)

    // Select specific recipe by ID, there should only be one answer, so return a single Recipe
    @Query("SELECT * FROM Recipe WHERE recipeID = :rID LIMIT 1")
    fun getRecipeByID(rID : Int) : LiveData<Recipe>

    // Search by ingredient

    // search by cook time
}