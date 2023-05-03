package com.wang.apis.lang.string;

public class Stringnochange {

    public static void main(String[] args) {
        String s="";
        //内部使用 char 数组存储数据????????查过去是byte[]

        String s1 = new String("aaa");
        String s2 = new String("aaa");

        // false
        System.out.println(s1 == s2);

        //intern保证同一引用
        String s3 = s1.intern();


        // true
        System.out.println(s1.intern() == s3);







    }
}

//缓存哈希、线程安全、常量池、网络安全