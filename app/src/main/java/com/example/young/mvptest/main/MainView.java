package com.example.young.mvptest.main;

import com.example.young.mvptest.login.LoginView;


public interface MainView extends LoginView {

    void success(MainResult mainResult);
}
