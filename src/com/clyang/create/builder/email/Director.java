package com.clyang.create.builder.email;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(String toAdress,String fromAdress){
        this.builder.buildTo(toAdress);
        this.builder.buildFrom(fromAdress);
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildSenddate();
        this.builder.sendMessage();

    }
}
