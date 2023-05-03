package com.wang.thread;

public class Tread1 extends Thread{
    public Tread1(String s) {
        super(s);
    }

    public Tread1() {

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程一正在执行");
        }
    }
}
