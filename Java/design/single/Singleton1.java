package com.wang.design.single;


/*单例模式
*
* 饿汉式（类加载就创建，放在静态代码块中）
*
* */


public class Singleton1 {

    //私有化构造方法
    private Singleton1(){

        /* 防止反射获取构造方法直接抛出异常
       if(instance != null) {
            throw new RuntimeException();
        }*/

    };

   //创建一个静态变量
    private static Singleton1 instance;

    //使用静态代码块初始化对象
    static {
        instance=new Singleton1();
    }

   //对外暴露获得该对象的接口
    public static Singleton1 getInstance(){
        return instance;
 }



}
