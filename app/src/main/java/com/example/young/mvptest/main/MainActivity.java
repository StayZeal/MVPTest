package com.example.young.mvptest.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.young.mvptest.R;
import com.example.young.mvptest.base.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.content_rv)
    RecyclerView contentRv;

    MainPresenterContract mainPresenter;

    ArticleAdapter articleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mainPresenter = new MainPresenter(mainView);
        mainPresenter.getList(this);

        contentRv.setLayoutManager(new LinearLayoutManager(this));
        articleAdapter = new ArticleAdapter();
        contentRv.setAdapter(articleAdapter);
    }

    @Override
    public void start() {

    }

    @Override
    public void success() {

    }

    @Override
    public void fail() {

    }

    @Override
    public void error() {

    }

    @Override
    public void success(MainResult mainResult) {

        articleAdapter.setData(mainResult.items);

    }

    public class ArticleAdapter extends BaseAdapter {

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_article, parent);
            return new VHolder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
            final MainResult.Item item = (MainResult.Item) datas.get(position);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mainPresenter.onItemClick(item, position);
                }
            });

        }


    }

    static class VHolder extends RecyclerView.ViewHolder {
        @BindView(android.R.id.text1)
        TextView text1;

        VHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

}
