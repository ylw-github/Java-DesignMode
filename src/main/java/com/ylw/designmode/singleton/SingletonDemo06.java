package com.ylw.designmode.singleton;


public class SingletonDemo06 {
    private static boolean flag = false;

    private SingletonDemo06() {

        if (flag == false) {
            flag = !flag;
        } else {
            throw new RuntimeException("单例模式被侵犯！");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> demo = Class.forName("com.ylw.designmode.singleton.SingletonDemo06");
        Object o = demo.newInstance();

        Class<?> demo1 = Class.forName("com.ylw.designmode.singleton.SingletonDemo06");
        Object o1 = demo.newInstance();
    }
}
