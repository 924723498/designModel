package com.clyang.behavior.mediator.video;

public class CPU extends Colleague{
    private String videoData="";
    private String soundData="";
    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    public void executeData(String data){
        final String[] split = data.split(",");
        this.videoData = split[0];
        this.soundData = split[1];
        getMediator().changed(this);
    }
}
