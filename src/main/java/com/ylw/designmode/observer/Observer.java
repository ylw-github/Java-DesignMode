package com.ylw.designmode.observer;

public interface Observer {

    // 观察者方法
    void update(int state);

    int getState();
}
