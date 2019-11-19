package com.clyang.behavior.observer.push;

public class ConcreteObserver implements Observer{
    private String observerState;
    @Override
    public void update(String newState) {
        observerState = newState;
        System.out.println("状态为 "+observerState);
    }
}
