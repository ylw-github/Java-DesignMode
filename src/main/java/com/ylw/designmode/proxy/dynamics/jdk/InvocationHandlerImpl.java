package com.ylw.designmode.proxy.dynamics.jdk;

import com.ylw.designmode.proxy.statics.ILoginUser;
import com.ylw.designmode.proxy.statics.LoginUser;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InvocationHandlerImpl implements InvocationHandler {

    private Object target;// 这其实业务实现类对象，用来调用具体的业务方法

    // 通过构造函数传入目标对象
    public InvocationHandlerImpl(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("调用开始处理");
        result = method.invoke(target, args);
        System.out.println("调用结束处理");
        return result;
    }

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // 被代理对象
        IUserDao userDao = new UserDao();
        InvocationHandlerImpl invocationHandlerImpl = new InvocationHandlerImpl(userDao);
        ClassLoader loader = userDao.getClass().getClassLoader();
        Class<?>[] interfaces = userDao.getClass().getInterfaces();

        // 主要装载器、一组接口及调用处理动态代理实例
        IUserDao newProxyInstance = (IUserDao) Proxy.newProxyInstance(loader, interfaces, invocationHandlerImpl);
        newProxyInstance.save();
    }
}
