package com.xy.dagger.di.components;

import com.xy.dagger.MainFragment;
import com.xy.dagger.di.scopes.ActivityScope;

import dagger.Subcomponent;

/**
 * Created by xingyun on 2016/9/6.
 */
@ActivityScope
@Subcomponent
public interface MainFragmentComponent {

    void  inject(MainFragment mainFragment);
}
