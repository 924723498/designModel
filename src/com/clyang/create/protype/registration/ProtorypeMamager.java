package com.clyang.create.protype.registration;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ProtorypeMamager {
    private static Map<String,Prototype> prototypeMap = new ConcurrentHashMap<>();
    private ProtorypeMamager(){}
    public synchronized static  void setPrototype(String prototypeId,Prototype prototype){
        prototypeMap.put(prototypeId,prototype);
    }
    public synchronized static void removePrototype(String prototypeId){
        prototypeMap.remove(prototypeId);
    }

    public synchronized static Prototype getPrototype(String prototypeId)throws Exception{
        Prototype prototype = prototypeMap.get(prototypeId);
        if(prototype ==null){
            throw new Exception("还未注册原型");
        }
        return prototype;
    }


}
