package com.clyang.behavior.iterator.extrinsic;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate{
    private Object[] objectArray;

    public ConcreteAggregate(Object[] objectArray) {
        this.objectArray = objectArray;
    }

    @Override
    protected Iterator createIterator() {
        return new ConcreteIterator(this) ;
    }
    public Object getElement(int index){
        if(index<objectArray.length){
            return objectArray[index];
        }
        return null;
    }

    public int size(){
        if(objectArray ==null){
            return 0;
        }
        return objectArray.length;
    }

    /**
     * 测试 fail-fast
     * @param args
     */
    public static void main(String[] args) {
        List list1 = new ArrayList<>();
        List list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        System.out.println(1);
    }
}
