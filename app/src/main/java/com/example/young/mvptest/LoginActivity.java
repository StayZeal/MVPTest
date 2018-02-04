package com.example.young.mvptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {


    @BindView(R.id.name_et)
    EditText nameEt;
    @BindView(R.id.password_et)
    EditText passwordEt;
    @BindView(R.id.login_btn)
    Button loginBtn;
    private LoginPresenter loginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        loginPresenter = new LoginPresenter();


    }

    private void login() {
        String userName = nameEt.getText().toString();
        String password = passwordEt.getText().toString();


        loginPresenter.login(userName, password, new LoginPresenter.OnResponseListener() {
            @Override
            public void onSuccess(LoginResult loginResult) {


                success();

            }

            @Override
            public void onError(RuntimeException e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }

    private void success() {
        /**
         * 1.保存登陆信息（省略）
         * 2.跳转到MainActivity
         */
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.login_btn)
    public void onViewClicked() {

        login();
    }
}
