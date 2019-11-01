package com.clyang.create.protype.registration;

public class Client {
    public static void main(String[] args) {
        try{
            Prototype p1 = new ConcretePrototype1();
            p1.setName("p1");
            ProtorypeMamager.setPrototype("p1",p1);

            Prototype p2 = ProtorypeMamager.getPrototype("p1").clone();
            p2.setName("p2");


            System.out.println(p1+"   "+p2);

            Prototype p3 = new ConcretePrototype2();
            p3.setName("p3");
            ProtorypeMamager.setPrototype("p3",p3);

            Prototype p4 = ProtorypeMamager.getPrototype("p3").clone();
            p4.setName("p4");
            System.out.println(p3+"   "+p4);
        }catch (Exception e){
            e.getMessage();
        }
    }
}
