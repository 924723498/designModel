package com.clyang.behavior.mediator.demo;

public class ConcreteColleagueB extends Colleague{
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void operation() {
        getMediator().changed(this);

    }
}
