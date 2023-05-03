package com.wang.design.single;


/*单例模式
*
* 懒汉式（静态内部类）
* 优秀的单例模式，保证了多线程，又没有影响性能和空间
*
* */


/**
 * @author Administrator
 */
public class Singleton4 {

    /**
     * 私有化构造方法
     */
    private Singleton4(){};


   /**
    * 创建一个静态内部类,并且使用final保证不可变（对象）
    */
    private static class SingletonHolder{
        private static final Singleton4 INSTANCE=new Singleton4();

   }



   /**
    * 对外暴露获得该对象的接口，调用的时候才会初始化，节约性能和空间
    */
    public static Singleton4 getInstance(){
        return SingletonHolder.INSTANCE;
 }

    /**
     * 下面是为了解决序列化反序列化破解单例模式
     */
    private Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}











