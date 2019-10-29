package com.ylw.designmode.facade;

public class AliService implements  IAliService {
    @Override
    public void sendSMS(String msg) {
        System.out.println("支付宝发送消息 -> "+msg);
    }
}
