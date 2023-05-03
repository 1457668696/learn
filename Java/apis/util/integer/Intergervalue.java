package com.wang.apis.util.integer;

public class Intergervalue {
    public static void main(String[] args) {

        Integer x1=132;

        //自动调用valueOf方法。缓存池里面就引用相同地址，不同新的对象

        Integer y1=132;
        Integer z = Integer.valueOf(135);
        Integer k = Integer.valueOf(135);
        System.out.println(z.equals(k));

    }
}
