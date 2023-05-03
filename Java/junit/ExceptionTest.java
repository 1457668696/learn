package com.wang.junit;

import org.junit.Test;

/**
 * @author Administrator
 */
public class ExceptionTest {

    int[] a ={1,4,5,6,4};


    /**
     * 测试是否为数组越界异常
     * */
    @Test(expected = IndexOutOfBoundsException.class)
    public void exceptionTest(){

        System.out.println(a[5]);


    }


    /**
     *  不符合预期的时候。请看错误日志信息
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void exceptionTest1(){

        System.out.println(5/0);
        System.out.println(a[5]);


    }





}
