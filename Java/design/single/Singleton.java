package com.wang.design.single;


/*单例模式
*
* 饿汉式（类加载就创建,直接放在静态变量中）
*
* */


public class Singleton {

    //私有化构造方法
    private Singleton(){};

   //创建一个实例对象且保存到变量中
    private static Singleton instance= new Singleton();

   //对外暴露获得该对象的接口
    public static Singleton getInstance(){
        return instance;
 }



}
