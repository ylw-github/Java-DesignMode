package com.ylw.designmode.proxy.statics;

public class LoginUser implements ILoginUser {
    @Override
    public void login(String userName, String pwd) {
        System.out.println("执行登录操作 -> userName" + userName + "  pwd" + pwd);
    }
}
