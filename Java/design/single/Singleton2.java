package com.wang.design.single;


/*单例模式
*
* 懒汉式（使用时创建，放在创建方法中）
* 线程不安全。
*
* */


public class Singleton2 {

    //私有化构造方法
    private Singleton2(){};

   //创建一个静态变量
    private static Singleton2 instance;


   //对外暴露获得该对象的接口
    public static Singleton2 getInstance(){

        //判断对象是否创建，没有就创建一个对象
        if(instance==null){
            instance=new Singleton2();
        }

        //如果已经创建，那么就返回
        return instance;
 }




   /*加上synchronized关键字就可以防止多线程访问异常

       public static synchronized Singleton2 getInstance(){


        if(instance==null){
            instance=new Singleton2();
        }


        return instance;
    }*/










}
