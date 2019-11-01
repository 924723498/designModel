package com.clyang.structure.facade;

public class Facade {
    public void modules(){
        ModuleA a = new ModuleA();
        a.printA();
        ModuleB b = new ModuleB();
        b.printB();

        ModuleC c = new ModuleC();
        c.printC();
    }
}
