package com.ylw.designmode.factory.demo1;

import com.ylw.designmode.factory.entities.AudiCar;
import com.ylw.designmode.factory.entities.BMWCar;
import com.ylw.designmode.factory.entities.Car;

public class CarFactoryDemo1 {

    public static Car createCar(String carName){

        if("audi".equalsIgnoreCase(carName)){
            return new AudiCar();
        }else if("bmw".equalsIgnoreCase(carName)){
            return new BMWCar();
        }
        return null;
    }
}
