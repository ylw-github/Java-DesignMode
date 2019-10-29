package com.ylw.designmode.decorator;

public class Client {

    public static void main(String[] args) {
        HouseImpl houseImpl = new HouseImpl();
        houseImpl.run();
        System.out.println("###新增贴上墙纸..###");
        HouseDecorate houseDecorate = new HouseDecorateImpl(houseImpl);
        houseDecorate.run();
    }
}
