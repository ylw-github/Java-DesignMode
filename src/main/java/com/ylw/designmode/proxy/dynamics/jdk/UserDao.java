package com.ylw.designmode.proxy.dynamics.jdk;

public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("执行保存操作......");
    }
}
