package com.clyang.create.factorymethod;

public class ExportFinacialPdfFile implements ExportFile{
    @Override
    public boolean export(String data) {
        System.out.println("导出财务版Pdf文件");
        return true;
    }
}
