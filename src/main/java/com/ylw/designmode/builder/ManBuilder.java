package com.ylw.designmode.builder;

/**
 * ConcreteBuilder
 * 实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。
 * 在建造过程完成后，提供产品的实例
 */
public class ManBuilder implements IPersonBuilder {
    private Person person;

    public ManBuilder() {
        person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("构造头部原型");
    }

    @Override
    public void buildBody() {
        person.setBody("构造身体原型");
    }

    @Override
    public void buildFoot() {
        person.setFoot("构造脚步原型");
    }

    @Override
    public Person build() {
        return person;
    }
}
