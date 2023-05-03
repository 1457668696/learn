package com.wang.io;

import java.io.*;

public class zifuzi {
    public static void main(String[] args) throws Exception {             //编码和解码
        String name = "我爱中国abcABC";
        byte[] b = name.getBytes("GBK");
        //以当前代码默认字符集进行编码 ，如果强行使用就会乱码
//        byte[] b=name.getBytes();
//      默认utf-8编码
//        System.out.println(Arrays.toString(b));


        String s = new String(b, "GBK");
        //默认以utf-8解码，也可以设置解码方式
//        System.out.println(s);

        InputStream is=new FileInputStream(new File("F:\\Program Files\\code\\zuoye\\untitled\\io\\src\\1"));          //管道
//        int a=is.read();                   //读水滴💧
//        System.out.println(a);            // 读取第一个字节
//        int c=is.read();
//        System.out.println(c);            //读取第二个字节
//        int d=is.read();
//        System.out.println(d);           //读取第三个字节        ，没有了，返回-1；
                                          //循环
//        int e;
//        while ((e=is.read())!=-1) {                    //循环改进，但是遇到中文的时候，会阶段无法显示
////            System.out.print((char) e);







//            byte[] f=new byte[3];               //一次性读3个字节
//        int len=is.read(f);
//        System.out.println("读了几个字节"+len);
//        String a=new String(f);            //解码
//        System.out.println(a);
//           //f=[ab3];
//        int len2=is.read(f);
//        System.out.println("读了几个字节"+len2);
//        String d=new String(f);            //解码
//        System.out.println(d);
//         //f=[abc];
//        int len3=is.read(f);
//        System.out.println("读了几个字节"+len3);
//        String v=new String(f,0,2);            //解码       可以设置读取多少导入多少
//        System.out.println(v);
//        //f=[cdc];只有两个接上了前边的c


//        byte[] buffer=new byte[3];
//        int len;
//        while ((len=is.read(buffer))!=-1){                                  //如果不是三个成对的，依然会导致乱码
//            System.out.println(new String(buffer,0,len));
        byte[] buffer=is.readAllBytes();                                        //全部读取
        System.out.println(new String(buffer));

        }






        }


