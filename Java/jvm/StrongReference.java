package com.wang.jvm;
/**
 *强引用，即使内存崩溃也不会回收对象
 *
 */
public class StrongReference {

    public static void main(String[] args) {

        Object obj=new Object();
        //Java中默认的强引用类型。引用传递
        Object ref=obj;


        //断开引用
            obj=null;
            System.gc();
        System.out.println(ref);

    }





}
