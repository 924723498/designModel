package com.clyang.structure.composite.transparent;


public class Client {
    public static void main(String[] args) {
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");

        Component leaf1 = new Leaf("衬衣");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("裙子");

        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
//        leaf1.addChild(leaf2);
        root.printStruct("");
    }
}
