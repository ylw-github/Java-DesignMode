package com.ylw.designmode.facade;

public class Computer {
    private IAliService aliService;
    private IWeixinService weixinService;
    private IFoxmailService foxmailService;

    public Computer(){
        aliService = new AliService();
        weixinService = new WeixinService();
        foxmailService = new FoxmailService();
    }

    public void sendGroupMsg(String msg){
        aliService.sendSMS(msg);
        weixinService.sendSMS(msg);
        foxmailService.sendSMS(msg);
    }
}
