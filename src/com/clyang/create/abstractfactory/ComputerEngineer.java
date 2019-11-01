package com.clyang.create.abstractfactory;

public class ComputerEngineer {
    private Cpu cpu;

    private MainBoard mainBoard;

    public void makeComputer(int cpuType,int mainBoardType){
        this.cpu = CpuFactory.createCpu(cpuType);
        this.mainBoard = MainBoardFactory.createMainBoard(mainBoardType);
        this.cpu.caculate();
        this.mainBoard.installCPU();
    }

    public void makeComputer(AbstractFactory factory){
        this.cpu = factory.createCpu();
        this.mainBoard = factory.createMainBoard();
        this.cpu.caculate();
        this.mainBoard.installCPU();

    }

}
