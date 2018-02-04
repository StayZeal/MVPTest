package com.example.young.mvptest.main;

import com.example.young.mvptest.base.BaseResult;

import java.util.List;

/**
 */

public class MainResult extends BaseResult {

    List<Item> items;

    static class Item {

        public String title;
    }
}
