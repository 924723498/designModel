package com.clyang.create.abstractfactory;

public class AmdFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new AmdCpu(955);
    }

    @Override
    public MainBoard createMainBoard() {
        return new AmdMainBoard(955);
    }
}
