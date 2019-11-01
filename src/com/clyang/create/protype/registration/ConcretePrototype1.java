package com.clyang.create.protype.registration;

public class ConcretePrototype1 implements Prototype{
    private String name;
    @Override
    public Prototype clone() {
        Prototype concretePrototype1 = new ConcretePrototype1();
        concretePrototype1.setName(this.name);
        return concretePrototype1;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
