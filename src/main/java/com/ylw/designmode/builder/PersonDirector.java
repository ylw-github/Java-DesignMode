package com.ylw.designmode.builder;

/**
 * Director
 * 调用具体建造者来创建复杂对象的各个部分
 * 在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建
 */
public class PersonDirector {

    public Person constructPerson(IPersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.build();
    }

    public static void main(String[] args) {
        PersonDirector pb = new PersonDirector();
        Person person = pb.constructPerson(new ManBuilder());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
