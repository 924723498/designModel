package com.clyang.structure.composite.safe;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private List<Component> childComponents = new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }
    public void addChild(Component child){
        childComponents.add(child);
    }

    public void removeChild(int index){
        childComponents.remove(index);
    }

    @Override
    public void printStruct(String preStr) {
        // 先把自己输出
        System.out.println(preStr + "+" + this.name);
        if(this.childComponents !=null){
            for (Component childComponent : childComponents) {
                childComponent.printStruct(" ");
            }
        }

    }
}
