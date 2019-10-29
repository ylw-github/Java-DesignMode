package com.ylw.designmode.decorator;

public class HouseDecorateImpl extends HouseDecorate {

    public HouseDecorateImpl(House house) {
        super(house);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("贴上火影忍者墙纸...");
    }
}
