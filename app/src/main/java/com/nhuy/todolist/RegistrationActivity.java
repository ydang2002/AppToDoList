package com.nhuy.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText regEmail, regPassword;
    private Button regBtn;
    private TextView regQn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_registration);

        toolbar = findViewById(R.id.LoginToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Registration");

        regEmail = findViewById(R.id.RegistrationEmail);
        regPassword = findViewById(R.id.RegistrationPassword);
        regBtn = findViewById(R.id.RegistrationButton);
        regQn = findViewById(R.id.RegistrationPageQuestion);

        regQn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}