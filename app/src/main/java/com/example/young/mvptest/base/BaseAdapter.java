package com.example.young.mvptest.base;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.young.mvptest.main.MainResult;

import java.util.List;

/**
 * Created by YOUNG on 2018/2/5.
 */

public abstract class BaseAdapter<T> extends RecyclerView.Adapter {

    protected List<T> datas;

    public void setData(List<T> items) {
        datas = items;
        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return datas == null ? 0 : datas.size();
    }
}
