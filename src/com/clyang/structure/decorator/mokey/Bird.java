package com.clyang.structure.decorator.mokey;

public class Bird extends Change{
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        System.out.println("Bird Move");
    }
}
