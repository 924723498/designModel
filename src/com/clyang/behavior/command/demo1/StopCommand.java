package com.clyang.behavior.command.demo1;

public class StopCommand implements Command{
    private AudioPlayer myAudio;

    public StopCommand(AudioPlayer myAudio) {
        this.myAudio = myAudio;
    }

    @Override
    public void execute() {
        myAudio.stop();
    }
}
