package com.clyang.structure.flyweight;

public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        FlyWeight fly = factory.factory(new Character('a'));
        fly.operation("firstCell");
        fly = factory.factory(new Character('b'));
        fly.operation("secondCell");
        fly = factory.factory(new Character('a'));
        fly.operation("thirdCell");
    }

}
