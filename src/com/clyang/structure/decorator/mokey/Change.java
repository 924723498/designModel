package com.clyang.structure.decorator.mokey;

public class Change implements TheGreatestSage{
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        sage.move();
    }
}
