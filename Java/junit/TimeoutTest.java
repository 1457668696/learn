package com.wang.junit;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @author Administrator
 */


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TimeoutTest {





    /**
     * 方法超时设置
     * */
    @Test(timeout = 6000)
    public void timeoutTest() throws InterruptedException {

        Thread.sleep(5000);


    }

  /**
   * 按照顺序测试@FixMethodOrder(MethodSorters.NAME_ASCENDING)
   * */
    @Test
    public void testA() {
        System.out.println("first");
    }

    @Test
    public void testC() {
        System.out.println("third");
    }

    @Test
    public void testB() {
        System.out.println("second");
    }
}






