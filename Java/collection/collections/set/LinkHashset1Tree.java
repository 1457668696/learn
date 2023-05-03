package com.wang.collection.collections.set;

import java.util.*;

public class LinkHashset1Tree {
    public static void main(String[] args) {
        Set<String> s=new LinkedHashSet<>();
        //在元素中添加了地址，形成双链表，所以有序，更占内存，依然不重复，无索引，
        Set<Integer> a=new TreeSet<>();
        //可排序，自定义对象需要自己指定排序规则。
        Set<String> b=new TreeSet<>();
        //比较器对象,接口和这个默认使用这个
        Set<apple> c=new TreeSet<>((o1, o2) -> {return Double.compare(o2.getPrice(),o1.getPrice());//使用Double的Compara方法比较，自动过滤0，这里是降序，如果反过来就是升序。
        });
/*
                  return o2.getWeight()-o1.getWeight(); //降序
                return o2.getPrice()-o1.getPrice();  //这里返回的不是整数所以不行
*/
        a.add(50);
        a.add(85);
        a.add(8);
        a.add(45);
        System.out.println(a);
        System.out.println("------------------------------------------");
        //大写字母在前面
        b.add("com.collection.set.apple");
        b.add("egg");
        b.add("dog");
        b.add("Pig");
        System.out.println(b);
        System.out.println("---------------------------------------");

        apple a1= new apple("红富士","红色",9.9,500);
        apple b1= new apple("青苹果","绿色",15.9,300);
        apple c1= new apple("绿苹果","青色",29.9,400);
        apple d1= new apple("黄苹果","黄色",9.9,500);

        c.add(a1);
        c.add(b1);
        c.add(c1);
        c.add(d1);
        System.out.println(
                c
        );


    }
}
