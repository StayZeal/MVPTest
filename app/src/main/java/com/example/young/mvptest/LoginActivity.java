package com.example.young.mvptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {


    @BindView(R.id.name_et)
    EditText nameEt;
    @BindView(R.id.password_et)
    EditText passwordEt;
    private LoginPresenter loginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        loginPresenter = new LoginPresenter();

        login();

    }

    private void login() {
        String userName = nameEt.getText().toString();
        String password = passwordEt.getText().toString();


        loginPresenter.login(userName, password, new LoginPresenter.OnResponseListener() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                //处理请求结果
                //跳转到MainActivity
            }

            @Override
            public void onError(RuntimeException e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
