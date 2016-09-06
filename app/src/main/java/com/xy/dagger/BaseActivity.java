package com.xy.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xy.dagger.di.components.AppComponent;

/**
 * Created by xingyun on 2016/9/6.
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public AppComponent getAppComponent() {
        return ((Dagger2Application)this.getApplication()).getAppComponent();
    }
}
