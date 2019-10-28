package com.ylw.designmode.factory.demo3.impl;

import com.ylw.designmode.factory.demo3.interfaces.Chair;

public class BYDChair implements Chair {
    @Override
    public void transfer(int level) {
        System.out.println("比亚迪手动调座位...");
    }
}
