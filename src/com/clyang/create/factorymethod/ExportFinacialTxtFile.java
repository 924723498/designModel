package com.clyang.create.factorymethod;

public class ExportFinacialTxtFile implements ExportFile{
    @Override
    public boolean export(String data) {
        System.out.println("导出财务版TXT文件");
        return true;
    }
}
