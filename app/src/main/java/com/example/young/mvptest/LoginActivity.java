package com.example.young.mvptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginView {


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

        loginPresenter.login(userName, password, this);


/*        loginPresenter.login(userName, password, new LoginPresenter.OnResponseListener() {
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
        });*/
    }

    @Override
    public void start() {
        //加载进度条
    }

    @Override
    public void success() {
        /**
         * 1.保存登陆信息（省略）
         * 2.跳转到MainActivity
         */
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void fail() {

        //失败处理
    }

    @Override
    public void error() {
        //错误处理
    }

    @OnClick(R.id.login_btn)
    public void onViewClicked() {

        login();
    }
}
