package com.clyang.create.builder.demo;

public class ConcreateBuilder implements Builder{
    Product product =new Product();
    @Override
    public void buildPart1() {
        product.setPart1("part1.....1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("part2.....2");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}

