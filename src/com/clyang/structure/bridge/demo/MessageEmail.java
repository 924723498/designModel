package com.clyang.structure.bridge.demo;

public class MessageEmail implements MessageImplementor{
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用系统内email的方法，发送消息'"+message+"'给"+toUser);
    }
}
