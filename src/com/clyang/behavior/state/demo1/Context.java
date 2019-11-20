package com.clyang.behavior.state.demo1;

public class Context {
    private State state;


    public void setState(State state) {
        this.state = state;
    }

    public void request(String sampleParameter){
        state.handle(sampleParameter);
    }

}
