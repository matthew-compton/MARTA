package com.ambergleam.android.marta.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;

import com.ambergleam.android.marta.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        CardView cardView = (CardView) findViewById(R.id.activity_intro_card);
        cardView.setOnClickListener(view -> {
            Intent intent = new Intent(IntroActivity.this, SelectionActivity.class);
            startActivity(intent);
        });
    }

}
