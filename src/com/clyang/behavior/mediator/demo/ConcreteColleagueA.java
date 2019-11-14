package com.clyang.behavior.mediator.demo;

public class ConcreteColleagueA extends Colleague{
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void operation() {
        getMediator().changed(this);

    }
}
