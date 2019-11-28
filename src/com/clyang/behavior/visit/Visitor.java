package com.clyang.behavior.visit;

/**
 * @ClassName Visitor
 * @Description Visitor
 * @Author Administrator
 * @Date 2019/11/22 17:15
 */
public interface Visitor {
    void visit(NodeA node);
    void visit(NodeB node);
}
