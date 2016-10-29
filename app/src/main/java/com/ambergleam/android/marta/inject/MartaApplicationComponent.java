package com.ambergleam.android.marta.inject;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {MartaModule.class})
public interface MartaApplicationComponent extends MartaComponent {
}
