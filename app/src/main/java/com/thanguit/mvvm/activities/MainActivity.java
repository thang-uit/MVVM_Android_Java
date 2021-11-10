package com.thanguit.mvvm.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.thanguit.mvvm.R;
import com.thanguit.mvvm.databinding.ActivityMainBinding;
import com.thanguit.mvvm.viewModel.LoginViewModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLoginViewModel(new LoginViewModel());
    }
}