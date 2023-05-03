package com.wang.collection.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Collection1 {
    public static void main(String[] args) {
        // 数组索引
        int[] a = {1, 5, 6, 2, 5, 8};
        System.out.print("数组"+a[4]+"");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");

//Arraylist 有序、重复、有索引
        Collection c = new ArrayList();
        c.add(23);
        c.add("你好");
        c.add("你好");
        c.add(true);
        c.add(23.52);
        System.out.println("List有序、重复、有索引"+c);
//      System.out.println(c.get(4));
//      为什么这里没有索引 (使用Collection作为接口，无索引，要用List或者Set。三大接口)               A；要使用List为对象，使用接口就没有索引的方法       且索引过大会报错，应该使用.size判断
//      set集合无序、不重复、无索引
        Collection b = new HashSet();
        b.add(23);
        b.add("你好");
        b.add("你好");
        b.add(true);
        b.add(23.52);
        System.out.println("Set无序、不重复、无索引"+b);

//集合都支持泛型，目的是为了编译阶段约束，且只支持引用数据类型，使用基本数据类型需要使用包装类。
        System.out.println("-----------------------------------------");

        Collection<String> d = new HashSet();
//报错、使用value of包装        b.add(23);
        d.add("你好");
        d.add("你好");
//      d.add(String.valueOf(23.52));

    }
}
