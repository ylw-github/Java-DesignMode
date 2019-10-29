package com.ylw.designmode.observer;

public class Client {

    public static void main(String[] args) {
        // 目标对象
        Subjecct subject = new Subjecct();

        // 创建多个观察者
        ObserverImpl obs1 = new ObserverImpl();
        ObserverImpl obs2 = new ObserverImpl();
        ObserverImpl obs3 = new ObserverImpl();

        // 注册到观察队列中
        subject.registerObserver(obs1);
        subject.registerObserver(obs2);
        subject.registerObserver(obs3);

        // 改变State状态
        subject.setState(300);
        System.out.println(obs1.getState());
        System.out.println(obs2.getState());
        System.out.println(obs3.getState());

        // 改变State状态
        subject.setState(400);
        System.out.println(obs1.getState());
        System.out.println(obs2.getState());
        System.out.println(obs3.getState());
    }
}
