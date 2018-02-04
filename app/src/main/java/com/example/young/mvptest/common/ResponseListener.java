package com.example.young.mvptest.common;


public interface ResponseListener<T> {
    void onSuccess(T result);

    void onError(RuntimeException e);

    void onComplete();
}