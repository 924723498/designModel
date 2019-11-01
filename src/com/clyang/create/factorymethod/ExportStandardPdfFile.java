package com.clyang.create.factorymethod;

public class ExportStandardPdfFile implements ExportFile{
    @Override
    public boolean export(String data) {
        System.out.println("导出标准版pdf文件");
        return true;
    }
}
