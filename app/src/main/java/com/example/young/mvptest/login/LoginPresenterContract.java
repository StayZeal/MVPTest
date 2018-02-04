package com.example.young.mvptest.login;

/**
 * Created by YOUNG on 2018/2/5.
 */

public interface LoginPresenterContract {

    void login(String userName, String password, final LoginView loginView);
}
