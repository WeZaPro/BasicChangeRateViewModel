package com.taweesak.changerateviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private MutableLiveData<Double> rate = new MutableLiveData<>();

    public void setText(Double input) {
        rate.setValue(input);
    }

    public LiveData<Double> getText() {
        return rate;
    }
}
