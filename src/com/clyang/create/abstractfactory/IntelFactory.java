package com.clyang.create.abstractfactory;

public class IntelFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public MainBoard createMainBoard() {
        return new IntelMainBoard(755);
    }
}
