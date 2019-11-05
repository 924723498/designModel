package com.clyang.behavior.command.demo1;

/**
 *具体命令角色类
 */
public class PlayCommand implements Command{
    private AudioPlayer myAudio;

    public PlayCommand(AudioPlayer myAudio) {
        this.myAudio = myAudio;
    }

    @Override
    public void execute() {
        myAudio.play();
    }
}
