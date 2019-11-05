package com.clyang.behavior.command.demo1;

public class RewindCommand implements Command{
    private AudioPlayer myAudio;

    public RewindCommand(AudioPlayer myAudio) {
        this.myAudio = myAudio;
    }

    @Override
    public void execute() {
        myAudio.rewind();
    }
}
