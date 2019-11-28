package com.clyang.behavior.visit;

/**
 * @ClassName VisitorA
 * @Description VisitorA
 * @Author Administrator
 * @Date 2019/11/22 17:17
 */
public class VisitorA implements Visitor{
    @Override
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }

    @Override
    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }
}
