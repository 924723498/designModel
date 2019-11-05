package com.clyang.behavior.chainofresponsibility.exercise;

public class ConcreteHandler extends Handler{
    @Override
    public void handleRequest() {
        if(getSuccessor() !=null){
            System.out.println("pass");
            getSuccessor().handleRequest();
        }else{
            System.out.println("处理");
        }
    }
}
