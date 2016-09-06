package com.xy.dagger.di.components;

import com.xy.dagger.MainActivity;
import com.xy.dagger.di.modules.AppModule;
import com.xy.dagger.di.modules.BaseActivityModule;
import com.xy.dagger.di.modules.MainActivityModule;
import com.xy.dagger.di.scopes.ActivityScope;

import dagger.Component;

/**
 * Created by xingyun on 2016/9/6.
 */
@ActivityScope
@Component(modules = {MainActivityModule.class, BaseActivityModule.class}, dependencies = AppModule.class)
public interface MainActivityComponent extends BaseActivityComponent {

    // 对MainActivity进行依赖注入
    void inject(MainActivity mainActivity);

    MainFragmentComponent getMainFragmentComponent();

}
