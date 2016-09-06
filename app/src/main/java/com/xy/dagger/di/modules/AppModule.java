package com.xy.dagger.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xingyun on 2016/9/6.
 */
@Module
public class AppModule {
    private Context context;
    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return this.context;
    }
}
