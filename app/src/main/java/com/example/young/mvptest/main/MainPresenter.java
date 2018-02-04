package com.example.young.mvptest.main;

import com.example.young.mvptest.common.ResponseListener;


public class MainPresenter implements MainPresenterContract {

    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void getList() {

        mainView.start();
        //网络请求，此处省略，onResponseListener为请求回调

        ResponseListener<MainResult> onResponseListener = new ResponseListener<MainResult>() {
            @Override
            public void onSuccess(MainResult result) {
                if (result.success) {
                    //保存登陆信息
                    mainView.success(result);
                } else {
                    mainView.fail();
                }
            }

            @Override
            public void onError(RuntimeException e) {

                mainView.error();
            }

            @Override
            public void onComplete() {

            }
        };

    }

    @Override
    public void onItemClick(MainResult.Item item, int position) {

        //保存到本地

    }
}
