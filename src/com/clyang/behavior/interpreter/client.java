package com.clyang.behavior.interpreter;

public class client {
    public static void main(String[] args) {
        Context ctx = new Context();
        Variable x = new Variable("x",ctx);
        Variable y = new Variable("y",ctx);
        Constant c = new Constant(true);
        ctx.assign(x, false);
        ctx.assign(y, true);

        Expression exp = new Or(new And(c,x) , new And(y,new Not(x)));
        System.out.println("x=" + x.interpret(ctx));
        System.out.println("y=" + y.interpret(ctx));
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));
    }
}
