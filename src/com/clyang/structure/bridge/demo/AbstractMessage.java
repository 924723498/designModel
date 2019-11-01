package com.clyang.structure.bridge.demo;

public class AbstractMessage {
    MessageImplementor implementor;

    public AbstractMessage(MessageImplementor implementor) {
        this.implementor = implementor;
    }

    public void sendMessage(String message,String toUser){
        this.implementor.send(message,toUser);
    }
}
