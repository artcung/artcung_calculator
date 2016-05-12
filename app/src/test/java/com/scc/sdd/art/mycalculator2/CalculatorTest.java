package com.scc.sdd.art.mycalculator2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    //Arrange
    Calculator calculator = new Calculator();

    @Test
    public void หนึ่งบวกหนึ่งเท่ากับสอง(){
        //Act
        double actualResult = calculator.plus(1,1);
        //Assert
        assertEquals(2.0, actualResult,0);
    }

//    @Test
//    public void หนึ่งลบหนึ่งเท่ากบัยศูนย์(){
//        double actualResult = calculator.sub(1,1);
//        assertEquals(0.0, actualResult,0);
//    }
//
//    @Test
//    public void สองลบหนึ่งเท่ากบัยหนึ่ง(){
//        double actualResult = calculator.sub(2,1);
//        assertEquals(1.0, actualResult,0);
//    }
//
//  ***Refactor Code ลบ จาก 2 method ที่ ซ้ำซ้อน และการ ประกาศตัวแปล
    @Test
    public void ลบ(){
        assertEquals(0.0, calculator.sub(1,1),0);
        assertEquals(1.0, calculator.sub(2,1),0);
        assertEquals(-1.0, calculator.sub(2,3),0);
    }
    @Test
    public void หนึ่งคูณหนึ่งเท่ากบัยหนึ่ง(){
        double actualResult = calculator.mul(1,1);
        assertEquals(1.0, actualResult,0);
    }

    @Test
    public void หนึ่งหารหนึ่งเท่ากบัยหนึ่ง(){
        double actualResult = calculator.div(1,1);
        assertEquals(1.0, actualResult,0);
    }

    @Test(expected = DevideByZeroException.class)
    public void สองหารศูนย์จะเกิดข้อฟิดพลาด_DevideByZeroException(){
        double actualResult = calculator.div(2,0);
    }
}
