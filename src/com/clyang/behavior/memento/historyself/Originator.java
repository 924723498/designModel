package com.clyang.behavior.memento.historyself;

public class Originator {

    public String state;

    public void changeState(String state) {
        this.state = state;
        System.out.println("change state " + state);

    }

    public Memento createMemento() {
        return new Memento(this);
    }

    public void restoreMemento(MementoIF memento) {
        changeState(((Memento) memento).getState());

    }

    private class Memento implements MementoIF {
        private String state;

        private Memento(Originator originator) {
            this.state = originator.state;
        }

        private String getState() {
            return state;
        }
    }

}
