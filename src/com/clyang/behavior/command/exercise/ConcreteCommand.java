package com.clyang.behavior.command.exercise;

public class ConcreteCommand implements Command {
   private Receiver receiver;
    @Override
    public void execute() {
        this.receiver.action();
    }

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
}
