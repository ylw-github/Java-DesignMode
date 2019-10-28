package com.ylw.designmode.factory;

import com.ylw.designmode.factory.demo3.factory.AudiCarFactory;
import com.ylw.designmode.factory.demo3.factory.BYDCarFactory;
import com.ylw.designmode.factory.demo3.interfaces.Chair;
import com.ylw.designmode.factory.demo3.interfaces.Engine;
import com.ylw.designmode.factory.entities.Car;
import com.ylw.designmode.factory.demo2.BMWCarFactory;

public class MainRun {

    public static void main(String[] args) {
        //1.简单工厂模式
        //Car audi = CarFactoryDemo1.createCar("audi");
        //Car bmw = CarFactoryDemo1.createCar("bmw");
        //audi.run();
        //bmw.run();

        //2.工厂方法模式
        //Car audi = new AudiCarFactory().createCar();
        //Car bmw = new BMWCarFactory().createCar();
        //audi.run();
        //bmw.run();

        //3.抽象工厂模式
        AudiCarFactory audiCarFactory = new AudiCarFactory();
        BYDCarFactory bydCarFactory = new BYDCarFactory();
        Engine audiEngine = audiCarFactory.createEngine();
        Chair audiChair = audiCarFactory.createChair();
        Engine bydEngine = bydCarFactory.createEngine();
        Chair bydChair = bydCarFactory.createChair();

        audiEngine.start();
        audiEngine.stop();
        audiChair.transfer(100);
        bydEngine.start();
        bydEngine.stop();
        bydChair.transfer(50);

    }
}
