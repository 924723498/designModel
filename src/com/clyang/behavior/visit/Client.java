package com.clyang.behavior.visit;

/**
 * @ClassName Client
 * @Description Client
 * @Author Administrator
 * @Date 2019/11/22 17:24
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new NodeA());
        os.add(new NodeB());

        Visitor visitor = new VisitorA();
        os.action(visitor);
    }
}
