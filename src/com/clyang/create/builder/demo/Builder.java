package com.clyang.create.builder.demo;

public interface Builder {
    void buildPart1();
    void buildPart2();

    Product retrieveResult();
}
