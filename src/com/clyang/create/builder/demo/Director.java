package com.clyang.create.builder.demo;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
