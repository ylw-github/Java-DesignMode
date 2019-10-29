package com.ylw.designmode.proxy.statics;

public class LoginUserProxy implements ILoginUser {

    private LoginUser target;

    public LoginUserProxy(LoginUser loginUser) {
        this.target = target;
    }

    @Override
    public void login(String userName, String pwd) {
        target.login(userName, pwd);
    }
}
