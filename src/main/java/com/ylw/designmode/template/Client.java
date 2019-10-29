package com.ylw.designmode.template;

public class Client {

    public static void main(String[] args) {
        // 1.模板方法
        BankTemplateMethod drawMoney = new DrawMoney();
        drawMoney.process();

        System.out.println("\n====================== \n");

        //2.匿名内部类的方式
        BankTemplateMethod bankTemplateMethod = new BankTemplateMethod() {
            @Override
            void transact() {
                System.out.println("我要转账{匿名内部类的方式}...");
            }
        };
        bankTemplateMethod.process();
    }
}
