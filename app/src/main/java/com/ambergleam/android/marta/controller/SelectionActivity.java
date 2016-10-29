package com.ambergleam.android.marta.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.ambergleam.android.marta.MartaApplication;
import com.ambergleam.android.marta.R;
import com.ambergleam.android.marta.data.Adventure;
import com.ambergleam.android.marta.data.DataManager;

import java.util.List;

import javax.inject.Inject;

public class SelectionActivity extends AppCompatActivity {

    @Inject DataManager mDataManager;

    private List<Adventure> mAdventures;
    private TextView mTextViewShort;
    private TextView mTextViewMedium;
    private TextView mTextViewLong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        inject();
        setup();
        load();
        update();
    }

    private void inject() {
        ((MartaApplication) getApplication()).getMartaComponent().inject(this);
    }

    private void setup() {
        mTextViewShort = (TextView) findViewById(R.id.activity_selection_text_short);
        CardView cardViewShort = (CardView) findViewById(R.id.activity_selection_card_short);
        cardViewShort.setOnClickListener(view -> {
            Intent intent = new Intent(SelectionActivity.this, AdventureActivity.class);
            startActivity(intent);
        });
        mTextViewMedium = (TextView) findViewById(R.id.activity_selection_text_medium);
        CardView cardViewMedium = (CardView) findViewById(R.id.activity_selection_card_medium);
        cardViewMedium.setOnClickListener(view -> {
            Intent intent = new Intent(SelectionActivity.this, AdventureActivity.class);
            startActivity(intent);
        });
        mTextViewLong = (TextView) findViewById(R.id.activity_selection_text_long);
        CardView cardViewLong = (CardView) findViewById(R.id.activity_selection_card_long);
        cardViewLong.setOnClickListener(view -> {
            Intent intent = new Intent(SelectionActivity.this, AdventureActivity.class);
            startActivity(intent);
        });
        View refresh = findViewById(R.id.activity_selection_refresh);
        refresh.setOnClickListener(view -> {
            load();
        });
    }

    private void load() {
        mAdventures = mDataManager.getAdventures(3);
    }

    private void update() {
        mTextViewShort.setText(mAdventures.get(0).toString());
        mTextViewMedium.setText(mAdventures.get(1).toString());
        mTextViewLong.setText(mAdventures.get(2).toString());
    }

}
