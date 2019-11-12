package com.clyang.behavior.interpreter;

import java.util.Objects;

public class Constant extends Expression{
    private boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Constant constant = (Constant) o;
        return value == constant.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }


    @Override
    public boolean interpret(Context ctx) {
        return value;
    }

    @Override
    public String toString() {
        return " |" +value+ "| ";
    }
}
