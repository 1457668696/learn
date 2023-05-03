package com.wang.apis.lang.string;
/**
 * 可变字符串对象，对象容器
 * @author Administrator
 */
public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuffer s=new StringBuffer();
        //buffer有线程锁，更安全
        s.append(56);
        //直接拼接字符串，就不用+好链接
        s.append("你好");
        s.append(56.25);
        System.out.println(s);

        StringBuilder s1 = new StringBuilder();
        s1.append("我").append("是").append("中国").append("人");
        //因为返回的是对象本身，所以可以链式编程
        System.out.println(s1);

        s1.reverse().append(110);
        //反转
        System.out.println(s1);

        System.out.println(s1.length());
        //长度



        //一般最终需要转换成String来更方便比较
        System.out.println(s1.toString());
            String s3=s1.toString();

    }






}
