package com.clyang.create.factorymethod;

public class ExportTxtFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if (type.equals("standard")) {
            return new ExportStandardTxtFile();
        } else if (type.equals("financial")) {
            return new ExportFinacialTxtFile();
        } else {
            throw new RuntimeException("暂时不支持的类型");
        }
    }
}
