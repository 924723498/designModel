package com.clyang.behavior.state.demo1;

public class Client {
    public static void main(String[] args) {
        State state = new ConcreteStateA();
        state = new ConcreteStateB();
        Context context = new Context();
        context.setState(state);
        context.request("test");
    }
}
