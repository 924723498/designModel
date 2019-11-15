package com.clyang.behavior.memento.multiple;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private Originator o;
    private List<Memento> mementos = new ArrayList<>();
    private int current;

    public Caretaker(Originator o) {
        this.o = o;
        this.current = 0;
    }
     public int createMementor(){
        Memento memento = o.createMemento();
         mementos.add(memento);
        return current ++;


     }
     public void restoreMemento(int index){
        Memento memento = mementos.get(index);
        o.restoreMemento(memento);
     }
}
