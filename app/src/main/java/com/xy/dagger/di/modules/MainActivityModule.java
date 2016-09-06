package com.xy.dagger.di.modules;

import com.xy.dagger.model.UserModel;
import com.xy.dagger.presenter.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xingyun on 2016/9/6.
 */
@Module
public class MainActivityModule {

    @Provides
    public UserModel provideUserModel() {
        return new UserModel();
    }

}
