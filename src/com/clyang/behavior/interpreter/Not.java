package com.clyang.behavior.interpreter;

import java.util.Objects;

public class Not extends Expression{
    private Expression exp;

    public Not(Expression exp) {
        this.exp = exp;
    }

    @Override
    public boolean interpret(Context ctx) {
        return !exp.interpret(ctx);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Not not = (Not) o;
        return Objects.equals(exp, not.exp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exp);
    }

    @Override
    public String toString() {
        return "(!" +exp+")" ;
    }
}
