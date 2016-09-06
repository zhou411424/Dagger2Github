package com.xy.dagger.presenter;

import com.xy.dagger.model.UserModel;
import com.xy.dagger.view.IUserModelView;

import javax.inject.Inject;

/**
 * Created by xingyun on 2016/9/6.
 */
public class MainActivityPresenter implements IMainActivityPresenter {

    private IUserModelView userModelView;
    private UserModel userModel;

    @Inject
    public MainActivityPresenter(IUserModelView userModelView) {
        this.userModelView = userModelView;
    }

    @Override
    public void showUserInfo() {
        UserModel userModel = new UserModel();
        userModel.setUsername("Jackson");
        userModelView.showUser(userModel);
    }
}
