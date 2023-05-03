package com.wang.design.single;


/*单例模式
*
* 懒汉式（使用时创建，放在创建方法中）
* 线程不安全，基于cpu缓存，虚拟机优化等机制，俩个线程同时进入，可能会获得两个对象。
*
* */


/**
 * @author Administrator
 */
public class Singleton3 {

    /**
     * 私有化构造方法
     */
    private Singleton3(){};

   /**
    * 创建一个静态变量,并且使用volatile保证指令重优化
    */
    private static volatile Singleton3 instance;


   /**
   *  对外暴露获得该对象的接口
   */
    public static Singleton3 getInstance(){

        //判断对象是否创建，没有就创建一个对象。保证读操作不加锁
        if(instance==null) {

            //在方法内部加锁，获得锁以后再判断一次，注意这里可能会进来两个线程
            synchronized (Singleton3.class) {

                //抢到锁以后再判断，如果是线程1已经创建过了，这里就直接返回。是为了防止二次创造实例
                if (instance==null) {
                    instance = new Singleton3();
                }
            }
        }



        //如果已经创建，那么就返回
        return instance;
 }












}
