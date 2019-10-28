package com.ylw.designmode.singleinstance;

public class SingletonDemo05 {
    private SingletonDemo05 singletonDemo05;

    private SingletonDemo05() {

    }

    public SingletonDemo05 getInstance() {
        if (singletonDemo05 == null) {
            synchronized (this) {
                if (singletonDemo05 == null) {
                    singletonDemo05 = new SingletonDemo05();
                }
            }
        }
        return singletonDemo05;
    }
}
