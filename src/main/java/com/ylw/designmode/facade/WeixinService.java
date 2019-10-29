package com.ylw.designmode.facade;

public class WeixinService implements IWeixinService {
    @Override
    public void sendSMS(String msg) {
        System.out.println("微信发送信息-> " + msg);
    }
}
