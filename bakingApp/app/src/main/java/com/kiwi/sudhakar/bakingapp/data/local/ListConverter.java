package com.kiwi.sudhakar.bakingapp.data.local;

import android.arch.persistence.room.TypeConverter;

import com.kiwi.sudhakar.bakingapp.data.model.Ingredient;
import com.kiwi.sudhakar.bakingapp.data.model.Step;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class ListConverter {

    @TypeConverter
    public static String convertStepsToJson(List<Step> steps){
        Type stepList = new TypeToken<List<Step>>(){}.getType();
        return new Gson().toJson(steps, stepList);
    }

    @TypeConverter
    public static List<Step> convertJsonToSteps(String jsonToConvert){
        Type stepList = new TypeToken<List<Step>>(){}.getType();
        return new Gson().fromJson(jsonToConvert, stepList);
    }

    @TypeConverter
    public static String convertIngredientsToJson(List<Ingredient> ingredients) {
        Type ingredientList = new TypeToken<List<Ingredient>>(){}.getType();
        return new Gson().toJson(ingredients, ingredientList);
    }

    @TypeConverter
    public static List<Ingredient> convertJsonToIngredients(String jsonToConvert) {
        Type ingredientList = new TypeToken<List<Ingredient>>(){}.getType();
        return new Gson().fromJson(jsonToConvert, ingredientList);
    }

}
