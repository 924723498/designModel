package com.clyang.create.protype.simple;

public class ConcretePrototype1 implements Prototype{
    @Override
    public Prototype clone() {

        return new ConcretePrototype1();
    }
}
