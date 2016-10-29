package com.ambergleam.android.marta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        CardView cardViewShort = (CardView) findViewById(R.id.activity_selection_card_short);
        cardViewShort.setOnClickListener(view -> {
            Intent intent = new Intent(SelectionActivity.this, AdventureActivity.class);
            startActivity(intent);
        });

        CardView cardViewMedium = (CardView) findViewById(R.id.activity_selection_card_medium);
        cardViewMedium.setOnClickListener(view -> {
            Intent intent = new Intent(SelectionActivity.this, AdventureActivity.class);
            startActivity(intent);
        });

        CardView cardViewLong = (CardView) findViewById(R.id.activity_selection_card_long);
        cardViewLong.setOnClickListener(view -> {
            Intent intent = new Intent(SelectionActivity.this, AdventureActivity.class);
            startActivity(intent);
        });
    }

}
