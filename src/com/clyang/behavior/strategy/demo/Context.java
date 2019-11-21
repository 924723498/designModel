package com.clyang.behavior.strategy.demo;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.strategyInterface();
    }


}
