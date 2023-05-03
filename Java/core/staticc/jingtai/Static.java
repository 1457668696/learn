package com.wang.core.staticc.jingtai;
//共享变量，内存只加载一次，需要共享的东西。在堆中的静态区，只有一份            //实例成员变量，存在每个对象之中，很多份，比如特有信息，name,age，在堆中，
//属于类     类名.属性名                                              // 属于对象 对象.属性名
//方法同理  属于共同方法，对象都能调用或者类调用（通用功能）                 //属于对象的特有方法，对象自己的行为目的，却方法中访问了实例变量
public class Static {
    public static void main(String[] args) {

        //尽量用类名访问，因为随类一起加载的，本类中可以省略类名

        int onlinenumber = Demo.onlinenumber;
        System.out.println(onlinenumber);


    }







}
