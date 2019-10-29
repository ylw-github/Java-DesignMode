package com.ylw.designmode.observer;

import java.util.ArrayList;
import java.util.List;

public class Subjecct {
    //观察者的存储集合
    private List<Observer> list = new ArrayList<>();

    // 注册观察者方法
    public void registerObserver(Observer obs) {
        list.add(obs);
    }
    // 删除观察者方法
    public void removeObserver(Observer obs) {
        list.remove(obs);
    }

    // 通知所有的观察者更新
    public void notifyAllObserver(int state) {
        for (Observer observer : list) {
            observer.update(state);
        }
    }

    public void setState(int state) {
        notifyAllObserver(state);
    }
}
