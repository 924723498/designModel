package com.clyang.behavior.memento.single.black;

public class Caretaker {
    private MementoIF memento;
    public MementoIF retriveMemento(){
        return memento;
    }

    public void saveMemento(MementoIF memento){
        this.memento = memento;
    }


}
