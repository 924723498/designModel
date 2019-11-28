package com.clyang.behavior.visit;

/**
 * @ClassName VisitorB
 * @Description VisitorB
 * @Author Administrator
 * @Date 2019/11/22 17:19
 */
public class VisitorB implements Visitor{
    @Override
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }

    @Override
    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }
}
