package com.clyang.behavior.interpreter;

import java.util.Objects;

public class And  extends Expression{
    private Expression left;
    private Expression right;

    public And(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Context ctx) {

        return left.interpret(ctx) && right.interpret(ctx);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        And and = (And) o;
        return Objects.equals(left, and.left) &&
                Objects.equals(right, and.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    @Override
    public String toString() {
        return "And{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
