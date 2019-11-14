package com.clyang.behavior.mediator.video;

public class SoundCard extends Colleague{
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundData(String data){
        System.out.println("画外音 "+data);
    }

}
