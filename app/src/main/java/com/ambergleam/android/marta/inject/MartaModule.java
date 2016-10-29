package com.ambergleam.android.marta.inject;

import android.app.Application;
import android.content.Context;

import com.ambergleam.android.marta.data.DataManager;
import com.ambergleam.android.marta.data.MockDataManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MartaModule {

    private Application mApplication;

    public MartaModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(Context context) {
        return new MockDataManager(context);
    }

}