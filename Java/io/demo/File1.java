package com.wang.io.demo;

import java.io.File;
import java.text.SimpleDateFormat;

public class File1 {
    public static void main(String[] args) {
        File f=new File("D:\\Program Files (x86)\\1.txt");   //或者使用正斜杠，只用一个/，反斜杠需要两个防止转移，这是绝对路径，从盘符开始
        File f1=new File("Files/src/1.txt");                 //相对路径，模块名/文件夹/文件
        File f2=new File("D:\\Program Files (x86)");         //以文件夹大小创建对象，上边三种都有可能存在和不存在
         long s=f1.length();
       long size= f.length();
        System.out.println(s);


        System.out.println(f1.getAbsoluteFile());               //获得绝对路径
        System.out.println(f1.getName());                       //获取文件带后缀
        System.out.println(f1.getPath());                       //获取文件定义时使用的路径
        System.out.println(f1.length());                        //获取文件字节数
        long time =f1.lastModified();                           //最后修改时间
        System.out.println("最后修改时间为"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time));     //格式化时间
        System.out.println(f1.isFile());                        //判断是文件
        System.out.println(f1.isDirectory());                   //判断是文件夹




        System.out.println("-----------------------------------");




        System.out.println(f2.getAbsoluteFile());               //获得绝对路径
        System.out.println(f2.getName());                       //获取文件带后缀
        System.out.println(f2.getPath());                       //获取文件定义时使用的路径
        System.out.println(f2.length());                        //获取文件字节数
        long time1 =f1.lastModified();                           //最后修改时间
        System.out.println("最后修改时间为"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time1));     //格式化时间
        System.out.println(f2.isFile());                        //判断是文件
        System.out.println(f2.isDirectory());                   //判断是文件夹

    }
}