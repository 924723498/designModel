package com.clyang.behavior.observer.pull;

public class ConcreteObserver implements Observer {
    private String observerState;
    @Override
    public void update(Subject subject) {
        observerState = ((ConcreteSubject)subject).getState();

        System.out.println("观察者状态为："+observerState);
    }
}
