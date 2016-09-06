package com.xy.dagger.di.components;

import android.content.Context;

import com.xy.dagger.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by xingyun on 2016/9/6.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    Context getContext();
}
