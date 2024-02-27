package com.example.braindeadmode.ui.profile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.braindeadmode.R;

public class ProfileViewModel extends ViewModel {

    private MutableLiveData<Integer> profileImageResource;
    private MutableLiveData<String> username;

    public ProfileViewModel() {
        profileImageResource = new MutableLiveData<>();
        username = new MutableLiveData<>();
        // Initialize with default values or fetch from a data source
        profileImageResource.setValue(R.drawable.ic_profile_placeholder);
        username.setValue("John Doe");
    }

    public LiveData<Integer> getProfileImageResource() {
        return profileImageResource;
    }

    public LiveData<String> getUsername() {
        return username;
    }
}
