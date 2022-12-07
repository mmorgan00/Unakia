package com.app.unakia.data

import androidx.room.TypeConverter
import com.google.gson.Gson

class DataTypeConverters {
    @TypeConverter
    fun fromIngredientToJSON(ingredientList: IngredientList) : String
    {
        return Gson().toJson(ingredientList.ingredientList)
    }

//    fun JSONToIngredient(ingredientJson : String) : IngredientList
//    {
//        return Gson().fromJson(ingredientJson, List<String>::class)
//    }



}