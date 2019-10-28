package com.ylw.designmode.factory.entities;

public class BMWCar implements Car {
    @Override
    public void run() {
        System.out.println("我是宝马...");
    }
}
