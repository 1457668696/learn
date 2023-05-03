package com.wang.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Administrator
 */
public class Source1  implements Runnable{
    private int ticket = 20;


    //非必要不适用lock，因为需要自己释放锁，容易死，且jvm已经优化sy,原生支持，不会死锁
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {



          //进入循环
            for (int i = 0; i < 50; i++) {

                //线程开始等待
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    throw new RuntimeException(e);
                }


                //获取锁
       synchronized (this){

                    //不够票就退出循环
                  if (ticket<=0){
                      return;
                  }
                    System.out.println(Thread.currentThread().getName() + "卖票 ticket =" + ticket--);
                }
            }
        }






    public static void main(String[] args) {
        Source1 a=new Source1();
        Thread A=new Thread(a);
        Thread B=new Thread(a);
         A.start();
         B.start();



    }






}