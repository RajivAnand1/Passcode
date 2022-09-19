package com.example.passcodeforapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    }
    @Override
    protected void onRestart(){
        super.onRestart();
        startActivity(new Intent(this,MainActivity.class));
    }
}