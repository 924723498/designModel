package com.clyang.behavior.command.demo1.macrocommand;

import com.clyang.behavior.command.demo1.Command;

public interface MacroCommand extends Command {
    void add(Command command);
    void remove(Command command);
}
