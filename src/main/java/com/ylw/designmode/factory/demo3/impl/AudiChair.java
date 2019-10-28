package com.ylw.designmode.factory.demo3.impl;

import com.ylw.designmode.factory.demo3.interfaces.Chair;

public class AudiChair implements Chair {
    @Override
    public void transfer(int level) {
        System.out.println("奥迪电子调座位...");
    }
}
