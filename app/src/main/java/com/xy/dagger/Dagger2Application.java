package com.xy.dagger;

import android.app.Application;

import com.xy.dagger.di.components.AppComponent;
import com.xy.dagger.di.components.DaggerAppComponent;
import com.xy.dagger.di.modules.AppModule;

/**
 * Created by xingyun on 2016/9/6.
 */
public class Dagger2Application extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
