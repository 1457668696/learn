package com.wang.thread.pool;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/**
 * 单线程执行。时间紊乱+异常打断
 *
 * */
public class Time {
    public static void main(String[] args) {


        Timer timer=new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行AA、、、、、"+new Date());

                /*try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/


            }
        },0,2000);


        Timer timer1=new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行BB、、、、、"+new Date());

                //有异常就会全部报错
                System.out.println(10/0);


            }
        },0,2000);



        Timer timer2=new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行CC、、、、、"+new Date());

            }
        },0,2000);




    }
}
