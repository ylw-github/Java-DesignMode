package com.ylw.designmode.factory.demo3.factory;

import com.ylw.designmode.factory.demo3.impl.AudiChair;
import com.ylw.designmode.factory.demo3.impl.AudiEngine;
import com.ylw.designmode.factory.demo3.interfaces.CarFactory;
import com.ylw.designmode.factory.demo3.interfaces.Chair;
import com.ylw.designmode.factory.demo3.interfaces.Engine;

public class AudiCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new AudiEngine();
    }

    @Override
    public Chair createChair() {
        return new AudiChair();
    }
}
