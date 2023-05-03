package com.wang.base.study.base;

/**
 * @author Administrator
 */
public class ComputerBase {
/**
 * 1.计算机底层二进制。存储单位为字节，一个字节为8个二进制位。位才是小的数据。但是储存的是一个字节占8位，没有8位也要补齐8位（组成单位） 6为110=00000110
 * 8 4 2 1
 */
public static void main(String[] args) {

        //字符存储底层为数字（二进制转化）ASCII编码
        char c = 'a';
        System.out.println(c);
        System.out.println(c + 1);
        char a = 65;
        System.out.println(a);
        char b = 48;
        System.out.println(b);
        //中文为UTF-8
        // 图片视频也是二进制形式  ，采用除取余法

//        2.二进制转十进制，从右到左，乘2的0.1.2.3.4...次方之合。
//        0 1 0 1
//            X
//        8 4 2 1 =3

//        3.二进制转八进制，从右到左3位为一个，没有就补齐。（方便观察）
//        141  （8424）                   01100001（01为组合补一个零）
//
//        4.二进制转16进制   0-9 A B C D E F 4位一组
//        0101 0110 (4+1)(4+2)=56
//二进制开头
        int i=0b01100001;
        System.out.println(i);


        //八进制开头
        int i1=0141;
        System.out.println(i1);
        int i2=0x61;
        //十六进制开头
        System.out.println(0x61);



    }


}
