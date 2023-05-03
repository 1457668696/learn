package com.wang.thread;

/**
 * @author Administrator
 */
public class ThreadApi {
    public static void main(String[] args) throws InterruptedException {

        Thread one=new Tread1();



        //设置线程名字和获得名字，也可以通过构造函数设置名字
        System.out.println(one.getName());
        one.setName("1号");

        //线程休眠，静态方法通过类名.方法调用。充钱？？？？？？？？
        Thread.sleep(3000);

        //有参构造，设置名字，但是有参构造需要传给父类的Thread有参构造器
        Thread two=new Tread1("2号");
        System.out.println(two.getName());

        //返回当前线程名
        System.out.println(Thread.currentThread());





    }



}
