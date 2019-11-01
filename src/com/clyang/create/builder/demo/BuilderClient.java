package com.clyang.create.builder.demo;

public class BuilderClient {
    public static void main(String[] args) {
        Builder builder = new ConcreateBuilder();
        Director director = new Director(builder);
        director.construct();

        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
