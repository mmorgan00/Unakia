package com.app.unakia.data

import android.content.Context
import androidx.lifecycle.LiveData

class RecipeRepository(context : Context) {
    private lateinit var instance : RecipeRepository
    private var _recipeDAO : RecipeDAO = RecipeDatabase.getInstance(context).RecipeDAO()
    private var currentRecipe : Recipe? = null // init this to null base, however have a 'currently selected' one
    private lateinit var context: Context

    @Synchronized
    fun getInstance(): RecipeRepository
    {
        // ternary, if there is an instance return it otherwise make a new one
        instance = if(::instance.isInitialized) instance else RecipeRepository(context)
        return instance
    }

    /**** CRUD OPERATIONS ****/

    /**
     * Create recipe, takes in a recipe to insert to the DB
     * Later on will also do a web back up, if enabled by user
     */
    public fun createRecipe(recipe : Recipe)
    {
        _recipeDAO.insert(recipe)
    }

    public fun getRecipe(rID: Int) :  LiveData<Recipe>
    {
        return _recipeDAO.getRecipeByID(rID)
    }

    /**
     * @param recID: recipe ID to update
     * @param recipe: the new recipe information to update
     */
    public fun updateRecipe(rID : Int, recipe :Recipe)
    {
        throw NotImplementedError()
    }

    /**
     * @param rID: recipe ID to delete
     */
    public fun deleteRecipe(rID : Int)
    {
        throw NotImplementedError()
    }

}