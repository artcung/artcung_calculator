package com.scc.sdd.art.mycalculator2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorDivTest {
    private double op1;
    private double op2;
    private double expected;

    @Test
    public void div(){
        Calculator calculator = new Calculator();
        assertEquals(this.expected,
                calculator.div( this.op1, this.op2));
    }

    public CalculatorDivTest(double op1, double op2, double expected) {
        this.op1 = op1;
        this.op2 = op2;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data(){
        return Arrays.asList(new Object[][] {
                {1,1,1.0},
                {2,1,2.0},
        });
    }
}