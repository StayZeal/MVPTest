package com.example.young.mvptest.login;

/**
 * 开始登陆-progress bar
 * 登陆成功-跳转主页面
 * 登陆失败-弹出登陆失败提示
 * 网络请求失败-弹出网络连接失败提示
 */

public interface LoginView {

    void start();

    void success();

    void fail();

    void error();
}
