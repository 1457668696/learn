package com.wang.apis.util.random;

import java.util.Random;

/**
 * @author Administrator
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        //包左不包右    如果要从1开始就要在后边加1
        int r = random.nextInt(10);

        System.out.println(r);


    }
}