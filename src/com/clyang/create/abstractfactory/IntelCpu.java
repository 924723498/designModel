package com.clyang.create.abstractfactory;

public class IntelCpu implements Cpu {
    private int cpuPins;

    public IntelCpu(int cpuPins) {
        this.cpuPins = cpuPins;
    }

    @Override
    public void caculate() {
        System.out.println("Intel CPU的针脚数：" + cpuPins);
    }
}
