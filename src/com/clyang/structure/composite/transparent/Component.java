package com.clyang.structure.composite.transparent;

public abstract class Component {
    public abstract void printStruct(String preStr);

    public void addChild(Component child){
        throw new UnsupportedOperationException("对象不支持的功能");

    }
    public void removeChild(int index){
        throw new UnsupportedOperationException("对象不支持的功能");
    }

}
