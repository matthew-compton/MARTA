package com.ambergleam.android.marta.controller;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.ambergleam.android.marta.R;

public class AdventureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(AdventureActivity.this, VictoryActivity.class);
            startActivity(intent);
        }, 1500);

    }

}
