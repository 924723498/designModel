package com.clyang.create.abstractfactory;

public class CpuFactory {
    public static Cpu createCpu(int type){
        Cpu cpu = null;
        if(type==1){
            cpu = new IntelCpu(755);
        }else if(type ==2){
            cpu = new AmdCpu(955);
        }
        return cpu;

    }
}
