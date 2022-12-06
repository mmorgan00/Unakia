package com.app.unakia.data

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface RecipeDAO {
    @Insert
    fun insert(item : Recipe)

    // Select specific recipe by ID

    // Search by ingredient

    // search by cook time
}