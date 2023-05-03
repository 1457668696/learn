package com.wang.apis.util.integer;

/**
 * @author Administrator
 */
public class IntegerDemo {
    public static void main(String[] args) {

        Integer a1=10;
        //自动装箱

        //自动拆箱
        int a=a1;

        //使用包装类可以接受null无法崩溃,兼容性更强。集合也同理
//            int b=null;
        Integer a3=null;




        //2.将基本数据类型转换成字符串（用处不大，不如直接使用+""的方法链接隐式转换）,但是这个最优雅
        Integer c=23;
        String s=c.toString();
        //String s=c+""；
        System.out.println(s);







        //3.将字符串类型转换成真实的数据类型
        String st="23";
        //但是如果数据不对应会出错
        int age=Integer.parseInt(st);
        //根据需要自己调用parse方法。或者使用value of方法
        int age1=Integer.valueOf(st);
        //实际上value of内部自己调用的就是parseInt方法
        System.out.println(age+2);

    }
}
