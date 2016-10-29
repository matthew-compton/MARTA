package com.ambergleam.android.marta;

import android.app.Application;

import com.ambergleam.android.marta.inject.DaggerMartaApplicationComponent;
import com.ambergleam.android.marta.inject.MartaComponent;
import com.ambergleam.android.marta.inject.MartaModule;

public class MartaApplication extends Application {

    private static MartaComponent sMartaComponent;

    protected void createComponent() {
        setComponent(DaggerMartaApplicationComponent.builder()
                .martaModule(new MartaModule(this))
                .build());
    }

    public MartaComponent getMartaComponent() {
        return sMartaComponent;
    }

    public static void setComponent(MartaComponent martaComponent) {
        sMartaComponent = martaComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setupDagger();
    }

    private void setupDagger() {
        createComponent();
        sMartaComponent.inject(this);
    }

}