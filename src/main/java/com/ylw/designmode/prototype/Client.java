package com.ylw.designmode.prototype;

public class Client {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setTitle("书1");
        book1.addImage("图1");
        book1.showBook();
        System.out.println("-----------------");

        //以原型方式拷貝一份
        Book book2 = book1.clone();
        book2.showBook();
        System.out.println("-----------------");

        book2.setTitle("书2");
        book2.addImage("图2");
        book2.showBook();
        System.out.println("-----------------");

        //再次还原打印书本
        book1.showBook();
        System.out.println("-----------------");
    }

}
