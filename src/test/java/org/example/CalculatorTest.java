package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator=new Calculator();
    @Test
    public void sumCalculator(){
        Assert.assertEquals(5,calculator.sum(3,2));
    }
    @Test
    public  void setCalculatorSub(){
        Assert.assertEquals(5,calculator.subtraction(10,5));
    }
    @Test
    public  void setCalculatorMultiplication(){
        Assert.assertEquals(18,calculator.multiplication(6,3));
    }
    @Test
    public void setCalculatorDivision(){
        Assert.assertEquals(2,calculator.division(20,10));
    }
    @Test
    public void setCalculatorModuls(){
        Assert.assertEquals(2,calculator.moduls(12,5));
    }
}
