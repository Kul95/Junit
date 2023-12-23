package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SecondLargestElementInAnArrayTest {
    @Test
   public void secondLargest(){
       SecondLargestElement secondLargestElement=new SecondLargestElement();
       Assert.assertEquals(6,secondLargestElement.secondLargestElement(new int[]{1,2,3,4,5,6,7}));
   }
}
