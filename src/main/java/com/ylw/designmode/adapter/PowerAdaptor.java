package com.ylw.designmode.adapter;

public class PowerAdaptor implements JP110VInterface {
    private CN220VInterface cn220VInterface;

    public PowerAdaptor(CN220VInterface cn220VInterface) {
        this.cn220VInterface = cn220VInterface;
    }
    @Override
    public void connect() {
        cn220VInterface.connect();
    }
}
