package com.scc.sdd.art.mycalculator2;

public class Calculator {

    public double plus(double op1, double op2) {
        return op1 + op2;
    }

    public double sub(double op1, double op2) {
        return op1 - op2;
    }

    public double mul(double op1, double op2) {
        return op1 * op2;
    }

    public double div(double op1, double op2) {
        if( op2 == 0 ) {
            throw new DevideByZeroException();
        }
        return op1 / op2;
    }
}
