package com.clyang.create.abstractfactory;

public class IntelMainBoard implements MainBoard{
    int cpuHoles;

    public IntelMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("Intel 主板的插槽 "+cpuHoles);
    }
}
