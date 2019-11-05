package com.clyang.behavior.command.demo1;

public class Client {
    public static void main(String[] args) {
        //接收者
        AudioPlayer audioPlayer = new AudioPlayer();
        //命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);
        //创建请求者对象
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setStopCommand(stopCommand);
        keypad.setRewindCommand(rewindCommand);


        keypad.play();
        keypad.rewind();
        keypad.stop();
        keypad.play();
        keypad.rewind();



    }
}
