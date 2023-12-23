package org.example;

import org.junit.Assert;
import org.junit.Test;

public class FindMinArrayElementTest {

    @Test
    public void testFindMin(){
        FindMinArrayElement findMinArrayElement= new FindMinArrayElement();
        Assert.assertEquals(1,findMinArrayElement.findMinArr(new int[]{1,5,8,4,9,6}));
    }
}
