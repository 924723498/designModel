package com.clyang.create.factorymethod;

public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if (type.equals("standard")) {
            return new ExportStandardHtmlFile();
        } else if (type.equals("finacial")) {
            return new ExportFinacialHtmlFile();
        } else {
            throw new RuntimeException("暂时不支持的类型");
        }
    }
}
