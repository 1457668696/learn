package com.wang.apis.util.number;



/**
 * @author Administrator
 */
public class Compare {
    public static void main(String[] args) {


        Integer i=123;
        Integer i1=12345;

        //大于返回1，等于0，小于-1   return (x < y) ? -1 : ((x == y) ? 0 : 1);，内部结构，但是如果是小数就不行了，有专门的小数判断
        System.out.println(i.compareTo(i1));

        //如果数据有小数排序，用于自定义集合数组，
        // 使用sort自定义排序匿名内部类，comparator,return返回正负整数


        //       if (d1 < d2)
        //            return -1;           // 内部结构图
        //        if (d1 > d2)
        //            return 1;
        int compare = Double.compare(i, i1);

    }
}
