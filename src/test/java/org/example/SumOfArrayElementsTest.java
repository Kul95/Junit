package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SumOfArrayElementsTest {

    @Test
    public void testSumArr(){
        SumOfArrayElements  sumOfArrayElements=new SumOfArrayElements();
        Assert.assertEquals(10,sumOfArrayElements.sumOfArray(new int[]{1,2,3,4}));
    }
}
