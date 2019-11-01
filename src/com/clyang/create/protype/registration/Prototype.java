package com.clyang.create.protype.registration;

public interface Prototype {
    Prototype clone();
    String getName();
    void setName(String name);
}
