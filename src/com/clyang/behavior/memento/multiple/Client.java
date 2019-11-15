package com.clyang.behavior.memento.multiple;

public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();

        Caretaker c = new Caretaker(o);

        o.setState("0");
        c.createMementor();

        o.setState("1");
        c.createMementor();

        o.setState("2");
        c.createMementor();

        o.setState("3");
        c.createMementor();

        o.printState();

        System.out.println(" - --------------------------------");

        c.restoreMemento(1);
        o.printState();


    }
}
