package com.clyang.structure.proxy;

public class Client {
    public static void main(String[] args) {
        AbstractObject object = new ProxyObject();
        object.operation();
    }
}
