package com.clyang.structure.bridge.demo;

public class CommonMessage extends AbstractMessage{
    public CommonMessage(MessageImplementor implementor) {
        super(implementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }
}
