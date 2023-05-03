package com.wang.io.demo;

import java.io.File;

public class bianli {
    public static void main(String[] args) {
        File f2=new File("D:\\Program Files (x86)");
        File f1=new File("Files/src/2.txt");
        String[] String = f2.list();                              //获取一级文件名
        for (String s:String
             ) {
            System.out.println(s);
        }

        File[] files = f2.listFiles();                              //获得对象数组
        for (File f:files
             ) {
            System.out.println(f.getAbsoluteFile());

        }


        //当文件夹为文件或者不存在时，返回null。空文件夹返回长度为0的数组。有内容的文件夹是，所有的文件和文件夹放到数组里面，如果有隐藏内容的空文件夹，也会返回到数组里面去。









    }
}
