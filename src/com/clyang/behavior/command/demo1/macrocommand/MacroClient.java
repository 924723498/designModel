package com.clyang.behavior.command.demo1.macrocommand;

import com.clyang.behavior.command.demo1.*;

public class MacroClient {
    public static void main(String[] args) {
        //接收者
        AudioPlayer audioPlayer = new AudioPlayer();
        //命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        MacroCommand macroCommand = new MacroAudioCommand();
        macroCommand.add(playCommand);
        macroCommand.add(rewindCommand);
        macroCommand.add(stopCommand);

        macroCommand.execute();



    }
}
