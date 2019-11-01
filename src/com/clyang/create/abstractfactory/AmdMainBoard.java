package com.clyang.create.abstractfactory;

public class AmdMainBoard implements MainBoard{
    int cpuHoles;

    public AmdMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("Amd 主板的插槽 "+cpuHoles);
    }
}
