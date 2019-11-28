package com.clyang.behavior.visit;

/**
 * @ClassName Node
 * @Description Node
 * @Author Administrator
 * @Date 2019/11/22 17:15
 */
public abstract class Node {
    /**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);
}
