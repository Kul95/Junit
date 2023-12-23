package org.example;

import junit.framework.Assert;
import org.junit.Test;
public class FindMaxElementArrayTest {
@Test
    public void testFindMax(){
        FindMaxElemenetArray maxElemenetArray = new FindMaxElemenetArray();
        Assert.assertEquals(9,maxElemenetArray.findMax(new int[]{1,3,8,9,5,3}));
    }
}
