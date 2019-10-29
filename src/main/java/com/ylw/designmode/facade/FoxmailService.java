package com.ylw.designmode.facade;

public class FoxmailService implements IFoxmailService {
    @Override
    public void sendSMS(String msg) {
        System.out.println("foxmail发送消息 -> " + msg);
    }
}
