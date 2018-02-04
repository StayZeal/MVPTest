package com.example.young.mvptest.main;

/**
 * Created by YOUNG on 2018/2/5.
 */

public interface MainPresenterContract {
    void getList(MainView mainView);

    void onItemClick(MainResult.Item item, int position);
}
