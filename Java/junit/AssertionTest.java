package com.wang.junit;

import org.junit.Assert;
import org.junit.Test;



/**
 * @author Administrator
 */
public class AssertionTest {

    @Test
    public void test(){

        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;

        int var1 = 1;
        int var2 = 2;

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        //断言两个对象相等
        Assert.assertEquals(obj1,obj2);

       //判断引用，类似==
        Assert.assertSame(obj1,obj2);
        Assert.assertNotSame(obj2,obj4);

        Assert.assertNotNull(obj1);
        Assert.assertNull("对象不为空",obj5);


        Assert.assertTrue(var1<var2);
        Assert.assertFalse(var1>var2);

        Assert.assertArrayEquals(array1,array2);





    }





















}
