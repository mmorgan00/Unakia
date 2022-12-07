package com.app.unakia.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

@Entity

data class Recipe(
    // Standard ID indexed rows. Recipe would not inherently contain a unique field to warrant other strategy
    @PrimaryKey(autoGenerate = true) var recipeID: Long = 0,
    // Set of Ingredients because only care about quantities of things, duplicates will be accumulated into one line item
//    @ColumnInfo(name = "ingredients")
//    var ingredients: Set<Triple<String, String, Float>>,
    // Care about both ordering/indexing, and expandability. Set of strings works fine
//    @ColumnInfo(name = "cookingSteps")
//    var cookingSteps: Set<String> = mutableSetOf<String>(),
//    // May need to revisit this, unfamiliar on search by tag
//    // for search purposes, spicy, italian, gluten free, etc
//    @ColumnInfo(name = "searchTags") var searchTags: Set<String> = mutableSetOf<String>(),
//    @ColumnInfo(name = "numServings") var numOfServings : Int = 0,
//    // In minutes
//    @ColumnInfo(name = "totalCookTime") var totalCookTime : Int = 0,

    )

class Ingredient(
    var name : String,
    var quantityUnit : String,
    var quantityValue : Float

) {
    fun toStringSet(): Set<String> {

        return setOf<String>(name, quantityUnit, quantityValue.toString())
    }

}


