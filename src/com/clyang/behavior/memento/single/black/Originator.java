package com.clyang.behavior.memento.single.black;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("赋值 "+state);
    }

    public MementoIF createMemento(){
        return new Memento(state);

    }
    public void restoreMemento(MementoIF memento){
        this.setState((((Memento)memento).getState()));
    }

    private class Memento implements MementoIF{
        private String state;

        private Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }


}
