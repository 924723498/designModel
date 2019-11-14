package com.clyang.behavior.mediator.video;

public interface Mediator {
    /**
     * 当同事对象自身改变的时候来通知调停者
     * @param colleague
     */
    void changed(Colleague colleague);
}
