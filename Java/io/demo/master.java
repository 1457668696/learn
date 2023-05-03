package com.wang.io.demo;

import java.io.File;
import java.io.IOException;

public class master {
    public static void main(String[] args) throws IOException {
        File f1=new File("Files/src/2.txt");
        System.out.println(f1.createNewFile());        //创建文件、不常用

        File f2=new File("D:\\Program Files (x86)\\hello");
        System.out.println(f2.mkdir());                                   //新建文件夹，一级目录，mkdir


        File f3=new File("D:\\Program Files (x86)\\hello\\1\\2\\3" ); //文件夹，多级目录 mkdirs
        System.out.println(f3.mkdirs());

        File f4=new File("Files/src/2.txt");
        System.out.println(f4.delete());                                        //占用一样可以删除。！！！！！！！！

        File f5=new File("D:\\Program Files (x86)\\hello\\1\\2\\3");           //只能删除空文件夹
        System.out.println(f5.delete());

    }
}
