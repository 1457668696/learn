package com.wang.apis.lang.data;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Administrator
 */
public class DateDemo {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);
        //系统此刻的时间
        System.out.println(d.getTime());
        //1970.1.1 00.00.00 和current time一样


        //往后走1H121s的时间
        long start = System.currentTimeMillis();
        long end=start+(60*60+121)*1000;

        Date d1=new Date(end);
        //通过有参构造返回date时间
        System.out.println(d1);                                                 //星期 //早中晚
        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        //格式话
        String parse = s.format(d);
        //转换返回 String
        System.out.println(parse);

       //其他用法
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);







    }
}
