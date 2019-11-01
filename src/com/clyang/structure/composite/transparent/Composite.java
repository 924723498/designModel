package com.clyang.structure.composite.transparent;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> childComponents = new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }
    @Override
    public void addChild(Component child){
        childComponents.add(child);
    }
    @Override
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
