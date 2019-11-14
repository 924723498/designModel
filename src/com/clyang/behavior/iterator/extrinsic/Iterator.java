package com.clyang.behavior.iterator.extrinsic;

public interface Iterator {
    void first();
    void next();
    boolean isDone();
    Object currentItem();
}
