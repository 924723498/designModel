package com.clyang.structure.proxy;

public class ProxyObject  extends AbstractObject{
    RealObject realObject = new RealObject();
    @Override
    public void operation() {
        System.out.println("before realObject operation");
        realObject.operation();
        System.out.println("after realObject operation");

    }
}
