package com.labs.lab9.ui.deal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DealsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DealsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("No deals yet");
    }

    public LiveData<String> getText() {
        return mText;
    }
}