package com.xy.dagger.di.components;

import android.app.Activity;

import com.xy.dagger.di.modules.BaseActivityModule;
import com.xy.dagger.di.scopes.ActivityScope;

import dagger.Component;

/**
 * Created by xingyun on 2016/9/6.
 * Scope:更好的管理Component与Module之间的匹配关系，编译器会检查 Component管理的Modules，
 * 若发现标注Component的自定义Scope注解与Modules中的标注创建类实例方法的注解不一样，就会报错
 *
 * 注：Component里的ActivityScope必须和对应Module里标注的scope一致，否则编译报错
 */
@ActivityScope
@Component(modules = {BaseActivityModule.class})
public interface BaseActivityComponent {

    Activity getActivity();
}
