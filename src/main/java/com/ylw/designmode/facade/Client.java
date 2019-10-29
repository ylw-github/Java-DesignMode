package com.ylw.designmode.facade;

public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.sendGroupMsg("明天不用加班...");
    }
}
