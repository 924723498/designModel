package com.clyang.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Character,FlyWeight> files = new HashMap<>();
    public FlyWeight factory(Character state){
        FlyWeight flyWeight = files.get(state);
        if(flyWeight==null){
            flyWeight = new ConcreteFlyWeight(state);
            files.put(state,flyWeight);
        }
        return flyWeight;
    }
}
