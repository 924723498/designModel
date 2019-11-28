package com.clyang.behavior.visit;

/**
 * @ClassName NodeA
 * @Description NodeA
 * @Author Administrator
 * @Date 2019/11/22 17:16
 */
public class NodeA extends Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA(){
        return "NodeA";
    }
}
