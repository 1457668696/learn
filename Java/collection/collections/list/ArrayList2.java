package com.wang.collection.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("你好");
        list.add("我好");
        list.add("大家好");
        list.add("真的好");
        list.add("真的好");



        Iterator<String> iterator = list.iterator();
        //使用迭代器删除元素，
        while (iterator.hasNext()) {
            String s = iterator.next();
            if ("你好".equals(s)) {
//                list.remove("你好");
                  // 这样删有风险,并发修改异常
                iterator.remove();
                //使用迭代器自身方法删除当前元素，内部有自减逻辑，指针往后移动一位
            }

        }
        System.out.println(list);
        //foreach和lambda也会报错，无法解决


        for (int i = 0; i < list.size(); i++) {
            //使用for循环，可以倒着或者正着减减
            String s=list.get(i);
            if("大家好".equals(s)){
                list.remove("大家好");
                i--;
            }


//            for (int j = list.size()-1; j <0 ; j--) {
//
//            }
        }  System.out.println(list);
    }
}