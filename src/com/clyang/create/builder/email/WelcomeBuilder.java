package com.clyang.create.builder.email;

public class WelcomeBuilder extends Builder {
    public WelcomeBuilder() {
        msg = new WelcomeMessage();
    }

    @Override
    void buildSubject() {
        msg.setSubject("欢迎标题");
    }

    @Override
    void buildBody() {
        msg.setBody("欢迎内容");

    }
}
