package com.clyang.create.SingleTon;

public class InnerClassSingleton {

    private  InnerClassSingleton() {
    }
    private static class SingleTonHolder{
        private static  InnerClassSingleton instance
                =new InnerClassSingleton();
    }
    public static InnerClassSingleton getInstance(){
        return SingleTonHolder.instance;
    }
}
