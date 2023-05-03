package com.wang.base.study.base;

public class SortChange {
    public static void main(String[] args) {
        // 在Java中接收和传输的变量类型并不一定一致。

//  小的赋值给大的就是自动转换类型，向上转型
       byte b=12;
       // 0 0 0 0 1 1 0 0             字节8位

        //         8 4     =12
       int i=b;
       //(自动类型转换)
        // 00000000 00000000 00001100 （为0补0）  4个字节32位

        int a=129;
        // 1111111 11111111 1 0 0 0 0 0 0 0 1
//      byte b1=a; 小的转大的，会报错，无法自动转换，             只会截取最后8位（byte）且进行补码

        byte b1= (byte) a;
        //强制转换，会有数据的丢失风险，但是如果是浮点转成整数吗，是直接丢掉小数 ,在比较的时候需要把object强行转成子类，还有多态的时候，转成子类用其特殊方法
        System.out.println(b1);
       double dd=12.25;
       int ad= (int) dd;
        System.out.println(ad);

        //运算中的自动类型转换，最终结果以最高类型决定，且int前的类型都会自动转为int计算
        byte a1=127;
        short s=12345;
        int c1=123456789;
        long l1=12346578945L;
        double a4=a1+s+c1+l1;
        System.out.println(a4);






    }
}

//b-s-i-long-f-d
//  c