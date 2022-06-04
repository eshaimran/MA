package com.labs.lab9.ui.account;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AccountsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AccountsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hello");
    }

    public LiveData<String> getText() {
        return mText;
    }
}