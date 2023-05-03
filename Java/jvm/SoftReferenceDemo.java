package com.wang.jvm;


import java.lang.ref.SoftReference;

/**
 *
 *
 *软引用通过包装类实现，只有遇到内存不足时才会回收，通常适合用来做缓存
 *
 * */
public class SoftReferenceDemo {
    public static void main(String[] args) {

      String str="世界和平";

      //通过包装类实现软引用
      SoftReference<String> ref=new SoftReference<String>(str);
        str=null;
        System.gc();
        System.out.println(ref.get());






    }
}
