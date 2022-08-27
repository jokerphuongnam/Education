package com.pnam.education.ui.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.pnam.education.R;

public class LoginActivity extends AppCompatActivity {
    private LoginViewModel viewModel;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        viewModel = new ViewModelProvider(this).get(LoginViewModel.class);
        initView();
        setupAction();
        setupLiveData();
    }

    private void initView() {
        loginBtn = findViewById(R.id.login);
    }

    private void setupAction() {
        loginBtn.setOnClickListener(v -> {
            viewModel.login();
        });
    }

    private void setupLiveData() {

    }
}
