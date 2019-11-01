package com.clyang.create.builder.email;

public class Client {
    public static void main(String[] args) {
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("192.168.2.2","192.168.2.3");
    }
}
