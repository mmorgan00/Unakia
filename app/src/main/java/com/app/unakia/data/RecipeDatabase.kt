package com.app.unakia.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Recipe::class], version = 0)
abstract class RecipeDatabase() : RoomDatabase() {
    abstract fun RecipeDAO() : RecipeDAO

    companion object{

        @Volatile
        private var INSTANCE: RecipeDatabase? = null

        // synchronized function to be thread safe and follow singleton pattern
        fun getInstance(context: Context): RecipeDatabase
        {
            synchronized(this){
                var instance = INSTANCE

                if(instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        RecipeDatabase::class.java,
                        "recipeDatabase"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}