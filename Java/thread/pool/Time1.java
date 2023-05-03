package com.wang.thread.pool;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



/**
 *
 * 任务间不会互相影响
 * 抛异常以后，依然正常运行
 * */
public class Time1 {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService pool= Executors.newScheduledThreadPool(3);


        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行AA"+new Date());
            }
        },0,2, TimeUnit.SECONDS);

        //不影响任务，切换其他线程继续执行
         Thread.sleep(10000);



        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行BB"+new Date());
            }
        },0,2, TimeUnit.SECONDS);

      //抛异常以后，依然正常运行
        System.out.println(10/0);



        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行CC"+new Date());
            }
        },0,2, TimeUnit.SECONDS);




    }
}
