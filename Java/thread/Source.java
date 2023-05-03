package com.wang.thread;

import java.util.Random;

/**
 * @author Administrator
 */
public class Source extends Thread{
    private int ticket = 101;
    private String name;
    public Source(String name) {
        this.name = name;
    }

    public void run() {

        for (int i = 0; i < 500; i++) {


            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


     synchronized (this) {

                if (ticket < 1) {
                    return;
                }
                ticket--;
                System.out.println(Thread.currentThread().getName() + "卖票 ticket = " + ticket);
            }
        }
    }

    public static void main(String[] args) {

        Source myThreadA = new Source("A");
//        Source myThreadB = new Source("B");


        //还能这样创建？？？？？？？？？？？？
        new Thread(myThreadA,"窗口1").start();
        new Thread(myThreadA,"窗口2").start();
        new Thread(myThreadA,"窗口3").start();





    }




}
