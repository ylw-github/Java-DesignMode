package com.ylw.designmode.factory.demo3.factory;

import com.ylw.designmode.factory.demo3.impl.BYDChair;
import com.ylw.designmode.factory.demo3.impl.BYDEngine;
import com.ylw.designmode.factory.demo3.interfaces.CarFactory;
import com.ylw.designmode.factory.demo3.interfaces.Chair;
import com.ylw.designmode.factory.demo3.interfaces.Engine;

public class BYDCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new BYDEngine();
    }

    @Override
    public Chair createChair() {
        return new BYDChair();
    }
}
