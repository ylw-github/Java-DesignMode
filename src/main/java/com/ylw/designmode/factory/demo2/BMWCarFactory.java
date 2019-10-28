package com.ylw.designmode.factory.demo2;

import com.ylw.designmode.factory.entities.BMWCar;
import com.ylw.designmode.factory.entities.Car;

public class BMWCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMWCar();
    }
}
