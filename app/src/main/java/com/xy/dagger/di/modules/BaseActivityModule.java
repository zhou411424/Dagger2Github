package com.xy.dagger.di.modules;

import android.app.Activity;

import com.xy.dagger.di.scopes.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xingyun on 2016/9/6.
 * BaseActivity提供的Module
 */
@Module
public class BaseActivityModule {

    private Activity activity;

    public BaseActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    public Activity provideActivity() {
        return activity;
    }
}
