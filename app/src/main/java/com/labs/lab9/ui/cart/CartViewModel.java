package com.labs.lab9.ui.cart;

import android.widget.ArrayAdapter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CartViewModel extends ViewModel {
        private final MutableLiveData<String> mText;

        public CartViewModel() {
            mText = new MutableLiveData<>();
            mText.setValue("Your cart is empty");
        }

        public LiveData<String> getText(){return mText;}

}

