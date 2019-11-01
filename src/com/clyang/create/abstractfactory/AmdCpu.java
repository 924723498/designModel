package com.clyang.create.abstractfactory;

public class AmdCpu implements Cpu {
    private int cpuPins;

    public AmdCpu(int cpuPins) {
        this.cpuPins = cpuPins;
    }

    @Override
    public void caculate() {
        System.out.println("Amd CPU的针脚数：" + cpuPins);
    }
}
