package com.example.tamg.ui.lmdc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LmdcViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LmdcViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is lmdc fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}