package com.kiwi.sudhakar.bakingapp.ui.mainlist;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.kiwi.sudhakar.bakingapp.data.BakingRepository;

public class MainListFactory extends ViewModelProvider.NewInstanceFactory {

    private final BakingRepository mRepo;

    public MainListFactory(BakingRepository repo){
        mRepo = repo;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass){
        return (T) new MainListViewModel(mRepo);
    }


}
