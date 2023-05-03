package com.wang.apis.lang.math;


import java.util.Random;

/**
 * 工具类都是静态方法，直接类名加方法调用,可以自定义工具累
 * @author Administrator
 */
public class MathDemo {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(-56));

        //向上取整
        System.out.println(Math.ceil(5.000001));

        //向下取整
        System.out.println(Math.floor(6.9999));

        //指数次方
        System.out.println(Math.pow(2,16));
        //四舍五入
        System.out.println(Math.round(4.5666666));
        System.out.println(Math.round(4.46565));

        //返回0.0-1.0的随机数，包左不包右
        System.out.println(Math.random());

        //3-9的随机数
//        int a=(int)(Math.random()*7)+3;

        int randomInt = new Random().nextInt(0,10);
        System.out.println("随机数为："+randomInt);







    }




}
