package com.clyang.create.SingleTon;

public enum  enumSingleton {
    instance;

    public void singletonOperation(){
        System.out.println("enum singleton");
    }

    public static void main(String[] args) {
        final enumSingleton instance = enumSingleton.instance;
        instance.singletonOperation();
    }
}
