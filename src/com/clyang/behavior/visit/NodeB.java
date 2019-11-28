package com.clyang.behavior.visit;

/**
 * @ClassName NodeB
 * @Description NodeB
 * @Author Administrator
 * @Date 2019/11/22 17:16
 */
public class NodeB extends Node{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    /**
     * NodeB特有的方法
     */
    public String operationB(){
        return "NodeB";
    }
}
