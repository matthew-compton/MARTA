package com.ambergleam.android.marta.inject;

import com.ambergleam.android.marta.MartaApplication;
import com.ambergleam.android.marta.controller.SelectionActivity;

public interface MartaComponent {

    void inject(MartaApplication application);
    void inject(SelectionActivity activity);

}