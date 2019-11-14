package com.clyang.behavior.mediator.video;

public class VideoCard extends Colleague{

    public VideoCard(Mediator mediator) {
        super(mediator);
    }
    public void showData(String data){
        System.out.println("你正在观看"+data);
    }
}
