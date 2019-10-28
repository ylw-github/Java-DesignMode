package com.ylw.designmode.factory.demo2;

import com.ylw.designmode.factory.entities.AudiCar;
import com.ylw.designmode.factory.entities.Car;

public class AudiCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new AudiCar();
    }
}
