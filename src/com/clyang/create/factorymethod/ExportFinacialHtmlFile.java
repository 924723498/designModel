package com.clyang.create.factorymethod;

public class ExportFinacialHtmlFile implements ExportFile{
    @Override
    public boolean export(String data) {
        System.out.println("导出财务版HTML文件");
        return true;
    }
}
