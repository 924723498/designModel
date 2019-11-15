package com.clyang.behavior.memento.multiple;

import java.util.ArrayList;
import java.util.List;

public class Originator {
    private List<String> states;
    private int index;

    public Originator() {
        this.states = new ArrayList<>(32);
        this.index = 0;
    }
    public Memento createMemento(){
        return new Memento(states,index);
    }
    public void restoreMemento(Memento memento){
        states = memento.getStates();
        index = memento.getIndex();
    }

    public void setState(String state){
        states.add(state);
        index++;
    }

    public void printState(){
        for (String state : states) {
            System.out.println(state);
        }
    }



}
