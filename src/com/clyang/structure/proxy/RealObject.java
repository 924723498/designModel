package com.clyang.structure.proxy;

public class RealObject extends AbstractObject{
    @Override
    public void operation() {
        System.out.println("do someThing");
    }
}
