package com.wang.jvm;

import java.util.Map;
import java.util.WeakHashMap;
/**
 *
 *弱引用，只要进行垃圾回收以后就会被清楚，Mao类是强引用，希望自动清除就使用weakhashmap
 * */
public class WeekHashMapDemo {
    public static void main(String[] args) {

        String key=new String("和平发展");
        String value=new String("生存为上");
        Map<String,String> map=new WeakHashMap<String,String>();
        map.put(key,value);
        //清除引用之后，进行垃圾回收就不存在数据了
        key=null;
        System.gc();
        System.out.println(map);

    }
}
