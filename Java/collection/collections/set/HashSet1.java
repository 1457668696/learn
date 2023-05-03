package com.wang.collection.collections.set;

public class HashSet1 {
    public static void main(String[] args) {
        String s= "今天是10.4日";
        String n= "今天是10.5日";                     //String内容一样貌似hash也一样
        System.out.println(s.hashCode());            //原则上不同对象的hash值不同
        System.out.println(n.hashCode());            //默认长度16的数组null，元素的哈希值和数字长度求余数计算位置，如果是null直接存入，如果有数据则比较内容，7之前占据，7以后挂在下边，形成链表，当链表大于8以后会启动红黑树。


    }
}
