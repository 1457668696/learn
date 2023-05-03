package com.wang.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TreadOne {
    public static void main(String[] args)  {

        //1.继承Thread类
        Thread one=new Tread1();

        //2.实现接口，创建任务对象。把任务对象交给Thread封装成线程对象，有结果无法返回
        Runnable two=new MyThread();
        Thread two2=new Thread(two);

        //3.使用匿名内部类，直接实现接口。为2的优化
        Runnable three= () -> {for (int i = 0; i < 10; i++) {System.out.println("线程三正在执行");}};
        //依旧包装，也可以取名字
        Thread three3=new Thread(three,"5号");

        //4.Callable接口，是泛型接口，应该声明返回类型
        Callable<String> call=new Thread3(100);
        //FutureTask对象的作用，F是继承Runnable的，可以进行封装，而且还需要get方法返回执行结果。
        FutureTask<String> four=new FutureTask<>(call);
        //进行封装
        Thread four1=new Thread(four);


        one.start();
        two2.start();
        three3.start();
        four1.start();


        //调用Fur类的结果
        try {
            System.out.println(four.get());
        } catch (Exception e) {
            e.printStackTrace();
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行");



        }



    }
}
