package com.xy.dagger;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xy.dagger.di.components.MainActivityComponent;
import com.xy.dagger.model.UserModel;
import com.xy.dagger.presenter.MainActivityPresenter;
import com.xy.dagger.view.IUserModelView;

import javax.inject.Inject;

/**
 * Created by xingyun on 2016/9/6.
 */
public class MainFragment extends Fragment implements IUserModelView {

    private TextView usernameTv;

    @Inject
    MainActivityPresenter mainActivityPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static MainFragment getInstance() {
        MainFragment mainFragment = new MainFragment();
        return mainFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        usernameTv = (TextView) view.findViewById(R.id.tv_username);
        view.findViewById(R.id.btn_get).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivityPresenter.showUserInfo();
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() instanceof MainActivity) {
            MainActivityComponent mainActivityComponent = ((MainActivity) getActivity()).getMainActivityComponent();
            mainActivityComponent.getMainFragmentComponent().inject(this);
        }
    }

    @Override
    public void showUser(UserModel userModel) {
        usernameTv.setText("name="+userModel.getUsername());
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


}
