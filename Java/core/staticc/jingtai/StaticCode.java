package com.wang.core.staticc.jingtai;

public class StaticCode {
public static String schoolname;



    public static void main(String[] args) {
        System.out.println("main方法执行了");
    }

//用于初始化静态资源
    static {
        System.out.println("静态代码块执行了");
        schoolname="上海大学";




    }
    {
        System.out.println("在创建对象时运行，先于构造方法");


    }
}
