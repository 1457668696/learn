package com.wang.thread;
/**
 * 优点可以继续继承父类。扩展性更强
 * @author Administrator
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程二正在执行");
        }
    }
}
