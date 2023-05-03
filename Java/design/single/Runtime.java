package com.wang.design.single;

/*
* Java中的Runtime类使用了单例模式。已经贴出源码了
*
*
* */




/**
 * @author Administrator
 */
public class Runtime {


    /**
     * 把对象存入不可变的变量中
     */
    private static final Runtime CURRENT_RUNTIME = new Runtime();

    /**
     * 获取对象入口
     */
    public static Runtime getRuntime() {
        return CURRENT_RUNTIME;
    }


    /**
     * 私有构造方法
     */
    private Runtime() {}

    /**
     * 测试方法
     */

    public void test() {
        java.lang.Runtime runtime=java.lang.Runtime.getRuntime();
        java.lang.Runtime runtime1=java.lang.Runtime.getRuntime();
        //返回是true
        System.out.println(runtime==runtime1);
        System.out.println(runtime.totalMemory());


    }
}


