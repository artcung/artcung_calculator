package com.scc.sdd.art.mycalculator2;

public class MainController {
    Calculator calculator = new Calculator();
    CalculatorListener calculatorListener;

    public void setCalculatorListener(CalculatorListener calculatorListener) {
        this.calculatorListener = calculatorListener;
    }

    public void add(double arg1, double arg2){
        calculatorListener.onSuccess(String.valueOf(calculator.plus(arg1, arg2)));
    }

    public void sub(double arg1, double arg2){
        calculatorListener.onSuccess(String.valueOf(calculator.sub(arg1, arg2)));
    }
}
