package com.ylw.designmode.decorator;

public class HouseDecorate implements House {

    private House house;

    public HouseDecorate(House house){
        this.house=house;
    }

    @Override
    public void run() {
        house.run();
    }
}
