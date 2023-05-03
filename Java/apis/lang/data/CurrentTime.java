package com.wang.apis.lang.data;

/**
 * @author Administrator
 */
public class CurrentTime {
    public static void main(String[] args) {

        //开始时间
        long start=System.currentTimeMillis();


        long a=0;

        //循环
        for (long i = 0; i < 99999999; i++) {
            a+=i;
        }


        //结束时间
        long end=System.currentTimeMillis();

        System.out.println(a);
        System.out.println((end-start));



    }
}
