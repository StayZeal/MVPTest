package com.example.young.mvptest;

import android.util.Log;

/**
 * Created by YOUNG on 2018/2/4.
 */

public class LoginPresenter {

    private static final String TAG = "LoginPresenter";

    void login(String userName, String password, OnResponseListener onResponseListener) {


        Log.i(TAG, "网络请求登陆");

        onResponseListener.onSuccess(new LoginResult());

    }

    interface OnResponseListener {
        void onSuccess(LoginResult loginResult);

        void onError(RuntimeException e);

        void onComplete();
    }
}
