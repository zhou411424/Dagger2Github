package com.xy.dagger;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.xy.dagger.di.components.DaggerMainActivityComponent;
import com.xy.dagger.di.components.MainActivityComponent;
import com.xy.dagger.di.modules.AppModule;
import com.xy.dagger.di.modules.BaseActivityModule;
import com.xy.dagger.di.modules.MainActivityModule;

public class MainActivity extends BaseActivity {

    private MainActivityComponent mainActivityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //appModule和baseActivityModule必须被设置
        mainActivityComponent = DaggerMainActivityComponent.builder()
                .appModule(new AppModule(this))
                .baseActivityModule(new BaseActivityModule(this))
                .mainActivityModule(new MainActivityModule()).build();
        mainActivityComponent.inject(this);

        MainFragment mainFragment = MainFragment.getInstance();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_container, mainFragment);
        transaction.commit();
    }

    public MainActivityComponent getMainActivityComponent() {
        return mainActivityComponent;
    }


}
