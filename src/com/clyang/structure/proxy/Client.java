package com.clyang.structure.proxy;

public class Client {
    public static void main(String[] args) {
        AbstractObject object = new ProxyObject();
        object.operation();

        /*String a = "ab";
        String b ="cd";
        String c = "abcd";
        String d = a+"cd";
        String e = "ab"+b;
        String f = "ab"+"cd";
        System.out.println((a+b)==c);
        System.out.println(d==c);
        System.out.println(e==c);
        System.out.println(f==c);*/


    }
}
