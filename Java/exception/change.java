package com.wang.exception;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class change {
    public static void main(String[] args) {
        //运行时异常，程序员水平不行，继承RuntimeException
        int[] a = {1, 2, 3, 4};
        System.out.println(a[1]);
       System.out.println(a[2]);
       System.out.println(a[3]);


       // 1.数组越界，ArrayIndexOutOfBoundException
        System.out.println(a[4]);




       // 2.空指针异常，NullPointerException,直接输出没问题，调用空指针变量功能会报错
         String name = null;
         System.out.println(name);
         System.out.println(name.length());




      // 3.类型转换异常ClassCastException
          Object o=23;
          String s=(String) o;



     // 4.计算异常，ArithmeticException
          int c=0/10;



    // 5.数字转化异常NumberFormatException
         String N="23AHH";
         Integer i=Integer.valueOf(N);
         System.out.println(i);


     //编译时异常提醒程序员可能会报错，注意检查，继承Exception，抛出后如果错误还是会提示
        String date = "2022-10-6 12:00:00";
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");




//        Date d = f.parse(date);
//        System.out.println(d);

        //在main方法中捕获异常，其他地方抛异常 可以知道底层情况，而且程序不崩溃。实际上只要代码无异常，都可以使用。
        try {
            pause("2022-09-11 11:20:30");
            System.out.println("时间格式正确");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("操作错误");
        }
        System.out.println("这里还可以显示");
//        谁出现异常，抛给调用者，通用Exception，但是错误仍然会崩溃。
//        InputStream is=new FileInputStream("E/50jpg");


    }

    //在这里往外抛以后，交给上层，让上层捕获
    public static void pause(String date) throws Exception {
        InputStream as = new FileInputStream("E:/50jpg");
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //编译时异常提醒程序员可能会报错，注意检查，继承Exception，抛出后如果错误还是会提示
        Date d = f.parse(date);
        System.out.println(d);
        try {
            SimpleDateFormat fA = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date dA = f.parse(date);
            System.out.println(dA);

            //综合异常捕获
        } catch (Exception e) {
            e.printStackTrace();

            //多行捕获，方便代码。catch。尽量用官方的提示信息
//      }catch (NullPointerException e){}

        }

    }
}