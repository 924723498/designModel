package com.clyang.create.factorymethod;

public class ExportStandardTxtFile implements ExportFile{
    @Override
    public boolean export(String data) {
        System.out.println("导出标准版Txt文件");
        return true;
    }
}
