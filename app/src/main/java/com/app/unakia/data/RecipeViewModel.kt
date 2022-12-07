package com.app.unakia.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class RecipeViewModel(application : Application) : AndroidViewModel(application)
{
    private var _recipeRepository : RecipeRepository = RecipeRepository(application.baseContext)
    var currentRecipeID = MutableLiveData<Int>(1)
    var currentRecipe : LiveData<Recipe> = _recipeRepository.getRecipe(currentRecipeID.value!!)

    fun addRecipe(newRec : Recipe)
    {
        _recipeRepository.createRecipe(newRec)
    }

    // get any recipe, however can use lazily? to just re-get the current one
    fun getRecipe(rID : Int = currentRecipeID.value!!) : LiveData<Recipe>
    {
        return currentRecipe
    }

}