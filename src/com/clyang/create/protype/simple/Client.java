package com.clyang.create.protype.simple;

public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operation(){
        Prototype copyPrototype = this.prototype.clone();

        System.out.println(prototype ==copyPrototype);

    }

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype1();
        Client client = new Client(prototype);
        client.operation();
    }

}
