package com.clyang.structure.bridge.demo;

public class Client {

    public static void main(String[] args) {
        MessageImplementor messageImplementor = new MessageEmail();
        AbstractMessage message = new CommonMessage(messageImplementor);
        message.sendMessage("加班速度批准","boss");

        messageImplementor = new MessageSMS();
        message = new UrgencyMessage(messageImplementor);
        message.sendMessage("加急申请，速度批准","boss");
    }
}
