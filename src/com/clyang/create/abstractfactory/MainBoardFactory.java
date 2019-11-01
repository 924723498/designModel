package com.clyang.create.abstractfactory;

public class MainBoardFactory {
    public static MainBoard createMainBoard(int type){
        MainBoard mainBoard = null;
        if(type==1){
            mainBoard = new IntelMainBoard(755);
        }else if(type ==2){
            mainBoard = new AmdMainBoard(955);
        }
        return mainBoard;

    }
}
