package com.ylw.designmode.observer;

public class ObserverImpl implements Observer {

    private int state;
    @Override
    public void update(int state) {
        this.state = state;
        //System.out.println("接收到通知 -> " + state);
    }

    @Override
    public int getState() {
        return state;
    }
}
