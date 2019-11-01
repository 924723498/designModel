package com.clyang.create.abstractfactory;

public class Client {
    public static void main(String[] args) {
        //简单工厂方式
        ComputerEngineer engineer = new ComputerEngineer();
        engineer.makeComputer(1,2);

        //抽象工厂方式    产品族 的概念
        AbstractFactory intelFactory = new IntelFactory();
        engineer.makeComputer(intelFactory);

        AbstractFactory amdFactory = new AmdFactory();
        engineer.makeComputer(amdFactory);

    }
}
