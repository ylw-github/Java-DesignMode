package com.ylw.designmode.factory.demo3.impl;

import com.ylw.designmode.factory.demo3.interfaces.Engine;

public class BYDEngine implements Engine {
    @Override
    public void start() {
        System.out.println("比亚迪钥匙启动...");
    }

    @Override
    public void stop() {
        System.out.println("比亚迪钥匙关闭...");
    }
}
