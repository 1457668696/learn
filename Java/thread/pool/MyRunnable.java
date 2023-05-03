package com.wang.thread.pool;

public class MyRunnable implements Runnable{


    @Override
    public void run() {


for (int i=0;i<6;i++) {

    System.out.println(Thread.currentThread().getName() + "输出了：HelloWorld------"+i);
}

        try {
            System.out.println(Thread.currentThread().getName()+"本线程开始休眠");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
