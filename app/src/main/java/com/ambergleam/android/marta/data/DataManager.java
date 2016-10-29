package com.ambergleam.android.marta.data;

import java.util.List;

public interface DataManager {

    List<Adventure> getAdventures();
    List<Adventure> getAdventures(int amount);

}
