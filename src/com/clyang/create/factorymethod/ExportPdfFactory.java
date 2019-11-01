package com.clyang.create.factorymethod;

public class ExportPdfFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if (type.equals("standard")) {
            return new ExportStandardPdfFile();
        } else if (type.equals("financial")) {
            return new ExportFinacialPdfFile();
        } else {
            throw new RuntimeException("暂时不支持的类型");
        }
    }
}
