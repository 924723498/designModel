package com.clyang.behavior.mediator.video;

public class Client {

    public static void main(String[] args) {
        MainBoard mainBoard = new MainBoard();
        CDDriver cdDriver = new CDDriver(mainBoard);
        CPU cpu = new CPU(mainBoard);
        VideoCard videoCard = new VideoCard(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);
        mainBoard.setCdDriver(cdDriver);
        mainBoard.setCpu(cpu);
        mainBoard.setVideoCard(videoCard);
        mainBoard.setSoundCard(soundCard);
        cdDriver.readCD();
    }

}
