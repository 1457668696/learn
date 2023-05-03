package com.wang.collection.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class collection2api {
    public static void main(String[] args) {
        Collection<String> a=new ArrayList<>();
        a.add("Java");
        //添加
        a.add("Java");
        a.add("Html");
        a.add("黑马");
        a.add("MySql");

        System.out.println("添加\t"+a.add("true"));
        //hashSet添加重复元素会返回false、其他同理
        System.out.println("全部集合\t"+a);
//      a.clear();
//      清空元素
//      System.out.println"全部集合"(a);


        //api空、大小、包含、删除
        System.out.println("为空\t"+a.isEmpty());
        System.out.println("集合大小\t"+a.size());
        System.out.println("包含Java\t"+a.contains("Java"));
        System.out.println("包含ddd\t"+a.contains("ddd"));
        System.out.println("删除\t"+a.remove("Java"));;
        //注意、多个重复删除只会删除第一个、可以倒着遍历删除i--
        System.out.println("全部集合\t"+a);

        //转换数组
        Object[] arr=a.toArray();
        //集合使用类引用对象的时候会有其他类型的数据，使用Object防止报错
        System.out.println(Arrays.toString(arr));
        //数组默认打印地址、使用Array类的toString方法或者遍历


        //合并集合
        Collection<String> b=new ArrayList<>();
        b.add("第一个");
        b.add("第十一个");
        Collection<String> c=new ArrayList<>();
        c.add("第二个");
        c.add("第二十二个");
        b.addAll(c);
        //把C的全部给b，c不变
        System.out.println("并集为"+b);




    }
}
