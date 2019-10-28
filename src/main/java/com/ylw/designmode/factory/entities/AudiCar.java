package com.ylw.designmode.factory.entities;

public class AudiCar implements Car {
    @Override
    public void run() {
        System.out.println("我是奥迪...");
    }
}
