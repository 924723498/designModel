package com.clyang.behavior.command.demo1.macrocommand;

import com.clyang.behavior.command.demo1.Command;

import java.util.ArrayList;
import java.util.List;

public class MacroAudioCommand implements MacroCommand{
    private List<Command> commandList = new ArrayList<>();
    @Override
    public void add(Command command) {
        commandList.add(command);
    }

    @Override
    public void remove(Command command) {
        commandList.remove(command);
    }

    @Override
    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
