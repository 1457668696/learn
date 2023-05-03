package com.wang.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorUntil {

    public static void main(String[] args) {

        //通过工具包创建线程，没有异常处理，有风险
        ExecutorService pool= Executors.newFixedThreadPool(3);


        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());








    }
}
