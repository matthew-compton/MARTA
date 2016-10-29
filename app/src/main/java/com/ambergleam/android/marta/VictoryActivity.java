package com.ambergleam.android.marta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;

public class VictoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory);

        CardView cardView = (CardView) findViewById(R.id.activity_victory_card);
        cardView.setOnClickListener(view -> {
            Intent intent = new Intent(VictoryActivity.this, IntroActivity.class);
            startActivity(intent);
        });
    }

}
