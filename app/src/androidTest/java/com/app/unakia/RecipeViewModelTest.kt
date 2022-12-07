package com.app.unakia

import android.app.Application
import android.content.Context
import android.util.Log
import com.app.unakia.data.Ingredient
import com.app.unakia.data.Recipe
import com.app.unakia.data.RecipeViewModel
import org.junit.Test
import org.junit.Assert.*
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.app.unakia.data.RecipeRepository
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RecipeViewModelTest {

    private val r1 = Recipe(
//        ingredients = setOf<Triple<String, String, Float>>(
//            Triple("Sugar", "Cup", 1.0f),
//            Triple("Flour", "Cup", 1.0f))
//        ),
//        cookingSteps = mutableListOf<String>(
//            "Dry the Wets",
//            "Wet the Drys",
//            "Serve"
//        ),
//        searchTags = mutableSetOf<String>(
//            "Dry",
//            "Wet"
//        ),
//        numOfServings = 4,
//        totalCookTime = 10
    )
    private val appContext = ApplicationProvider.getApplicationContext<Application>()
    private val rVM = RecipeViewModel(appContext)


    @Test
    fun addRecipeSimple() {
        rVM.addRecipe(r1)
        val tR = rVM.getRecipe(1).value
        assert(tR != null)
        if (tR != null) {
            println("retrieved recipe ID " + tR.recipeID.toString())
            assert(tR.recipeID == 0 as Long)
        }

    }

}