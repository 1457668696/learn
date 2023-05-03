package com.wang.java8.lamble;

public class Runnable {
// Java 8之前：

    public static void main(String[] args) {

       new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("主线程");
                System.out.println("我是"+Thread.currentThread().getName());
            }
        }).start();




//Java 8方式：


        new Thread( () -> System.out.println("这是Java8中的线程"+Thread.currentThread().getName())).start();



    }














}
