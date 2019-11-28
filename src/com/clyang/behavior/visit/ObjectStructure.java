package com.clyang.behavior.visit;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ObjectStructure
 * @Description ObjectStructure
 * @Author Administrator
 * @Date 2019/11/22 17:22
 */
public class ObjectStructure {
    private List<Node> nodes =new ArrayList<>();
    public void action(Visitor visitor){
        for (Node node : nodes) {
            node.accept(visitor);
        }
    }

    public void add(Node node){
        nodes.add(node);
    }

}
