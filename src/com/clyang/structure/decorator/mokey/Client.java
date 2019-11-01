package com.clyang.structure.decorator.mokey;

public class Client {
    public static void main(String[] args) {
        TheGreatestSage sage = new MonkeyKing();

        TheGreatestSage bird = new Bird(sage);

        TheGreatestSage fish = new Fish(bird);
        TheGreatestSage fish1 = new Fish(new Bird(sage));
        fish.move();
        fish1.move();
    }
}
