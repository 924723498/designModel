package com.clyang.create.builder.email;

public class GoodByeBuilder extends Builder {
    public GoodByeBuilder() {
        msg = new WelcomeMessage();
    }

    @Override
    void buildSubject() {
        msg.setSubject("再见标题");
    }

    @Override
    void buildBody() {
        msg.setBody("再见内容");

    }
}
