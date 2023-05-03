package com.wang.jvm;


import com.wang.collection.data.array.Student;

import java.io.IOException;

/**
 *
 * 虚拟机运行时的一个线程类
 *
 * */
public class RunTime {

    public static void main(String[] args) throws InterruptedException {


        //单例模式，通过方法获取实例化对象
        Runtime runTime=Runtime.getRuntime();


        //最大内存
        System.out.println("最大内存"+runTime.maxMemory());

        //空闲内存
        System.out.println("空闲内存"+runTime.freeMemory());



        //创建大量对象
        for (int i=0;i<1000000000;i++){

      Student student=new Student();


        }


        System.out.println("操作后剩余空间"+runTime.freeMemory());


        //释放空间,异步通知释放，所以一开始会占用大量内存
        runTime.gc();


        //垃圾回收后的空间
         System.out.print("垃圾回收后空间"+runTime.freeMemory());



        //准备一个对象接受该线程
        Process note=null;


        //启动程序
        try {


            note=runTime.exec("notepad");

            Thread.sleep(5000);

        } catch (IOException e) {

            throw new RuntimeException(e+"指令错误或者文件不存在");
        }


        //线程销毁
       note.destroy();




    }





}
