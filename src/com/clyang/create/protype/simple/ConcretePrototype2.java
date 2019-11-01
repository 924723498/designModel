package com.clyang.create.protype.simple;

public class ConcretePrototype2 implements Prototype {
    @Override
    public Prototype clone() {

        return new ConcretePrototype2();
    }
}
