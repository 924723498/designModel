package com.clyang.create.factorymethod;

public class Client {
    public static void main(String[] args) {
        String data="10000";
        ExportFactory factory = new ExportTxtFactory();
        final ExportFile exporter = factory.factory("financial");
        exporter.export(data);
    }
}
