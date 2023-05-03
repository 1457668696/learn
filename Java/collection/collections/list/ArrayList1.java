package com.wang.collection.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//底层为数组，在添加第一个元素的时候，默认先创建一个长度为10的数组。size是数组的位置（个数），每加一个就往后移动一位，当size到达10以后就会执行grow()方法，扩容1.5倍。
//插入元素，首先指针往后移动一位，往后赋值，再插入对应的元素。
//删除元素，指针往前移动一位，然后互相赋值即可。
public class ArrayList1 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("java");
        list.add("Java");
        list.add("MySql");
        list.add("程序语言");

        Object[] objects = list.toArray();
        //集合转成数组
        System.out.println(objects);
        Arrays.asList(list);
        //数组转集合，这里不用list对象哦
        System.out.println(list);

        list.add(2,"html");
        //根据索引增加元素
        System.out.println(list);

//        System.out.println(list.add(1,"你好"));
//        暂时未知,无返回值

        list.remove(3);
        //根据索引删除元素，返回的是元素本身
        System.out.println(list);


        System.out.println(list.get(0));
        //索引取值

//        System.out.println( list.set(0,"我才是第一个") );
        list.set(0,"我才是第一个");
        //根据索引修改值，返回的是之前的元素
        System.out.println(list);
        System.out.println("--------------------------");






        //4种方式遍历（有索引所以有for循环）               //foreach
        list.forEach(System.out::println);


        System.out.println("--------------------------");



        for (String s : list) {                                //增强for
            System.out.println(s);
        }

        System.out.println("-------------------------");        //迭代器，迭代子iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s= it.next();
            System.out.println(s);


        }
        System.out.println("--------------------------------");
        for (int i = 0; i < list.size(); i++) {                  //for循环
            System.out.println(list.get(i));
        }
    }
}
