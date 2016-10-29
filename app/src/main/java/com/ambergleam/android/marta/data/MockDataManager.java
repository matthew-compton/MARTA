package com.ambergleam.android.marta.data;

import android.content.Context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MockDataManager implements DataManager {

    private Context mContext;
    private List<Adventure> mAdventureList;

    public MockDataManager(Context context) {
        mContext = context;
        mAdventureList = new ArrayList<>();
        mAdventureList.add(new Adventure("Fast Food", "8:00pm", "8:10pm", "Pizza Hut", "Taco Bell"));
        mAdventureList.add(new Adventure("Slow Food", "8:00pm", "8:00am", "Pizza Hut", "Taco Bell"));
        mAdventureList.add(new Adventure("Foooood", "8:00pm", "10:00pm", "Taqueria del Sol", "Piedmont Park"));
    }

    @Override
    public List<Adventure> getAdventures() {
        return mAdventureList;
    }

    @Override
    public List<Adventure> getAdventures(int amount) {
        LinkedList<Adventure> copy = new LinkedList<>(mAdventureList);
        Collections.shuffle(copy);
        return copy.subList(0, amount);
    }

}
