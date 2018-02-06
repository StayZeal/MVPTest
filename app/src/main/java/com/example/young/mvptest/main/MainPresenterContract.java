package com.example.young.mvptest.main;



public interface MainPresenterContract {
    void getList();

    void onItemClick(MainResult.Item item, int position);
}
