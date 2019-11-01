package com.clyang.structure.adapter.objectadapter;

public class Adapter {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    void sampleOperation1(){
        this.adaptee.sampleOperation1();
    }
    void sampleOperation2(){

    }


}
