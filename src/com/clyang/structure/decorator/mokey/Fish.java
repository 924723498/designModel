package com.clyang.structure.decorator.mokey;

public class Fish extends Change{
    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        System.out.println("Fish Move");
    }
}
