package com.kiwi.sudhakar.bakingapp.ui.mainlist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.kiwi.sudhakar.bakingapp.data.BakingRepository;
import com.kiwi.sudhakar.bakingapp.data.model.Recipe;

import java.util.List;

public class MainListViewModel extends ViewModel {

    private final LiveData<List<Recipe>> recipes;

    MainListViewModel(BakingRepository repository) {
        recipes = repository.getAllRecipes();
    }

    public LiveData<List<Recipe>> getAllRecipes(){
        return recipes;
    }
}
