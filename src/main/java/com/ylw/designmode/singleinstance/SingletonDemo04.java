package com.ylw.designmode.singleinstance;

public class SingletonDemo04 {

    public static SingletonDemo04 getInstance() {
        return UserEnum1.INSTANCE.getInstance();
    }

    private static enum UserEnum1 {
        INSTANCE;
        // 枚举元素为单例
        private SingletonDemo04 user;

        private UserEnum1() {
            System.out.println("SingletonDemo04");
            user = new SingletonDemo04();
        }

        public SingletonDemo04 getInstance() {
            return user;
        }
    }

    public static void main(String[] args) {
        SingletonDemo04 u1 = SingletonDemo04.getInstance();
        SingletonDemo04 u2 = SingletonDemo04.getInstance();
        System.out.println(u1 == u2);
    }
}
