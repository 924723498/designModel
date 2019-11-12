package com.clyang.behavior.interpreter;

import java.util.Objects;

public class Variable extends Expression {
    private String name;
    private Context ctx;

    public Variable(String name,Context ctx) {
        this.ctx=ctx;
        this.name = name;
    }

    @Override
    public boolean interpret(Context ctx) {

        return ctx.lookup(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Variable variable = (Variable) o;
        return Objects.equals(name, variable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
//        return " "+ctx.lookup(this) +" ";
        return " "+name +" ";
    }
}
