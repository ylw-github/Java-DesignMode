package com.ylw.designmode.factory.demo3.impl;

import com.ylw.designmode.factory.demo3.interfaces.Engine;

public class AudiEngine implements Engine {
    @Override
    public void start() {
        System.out.println("奥迪一键启停...");
    }

    @Override
    public void stop() {
        System.out.println("奥迪自动关闭...");
    }
}
