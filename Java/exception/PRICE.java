package com.wang.exception;

import java.util.Scanner;

public class PRICE {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (true){
            try {
                System.out.println("请输入合法的价格：");                                                    //嚣张的计算
                String s=sc.nextLine();
                double b=Double.valueOf(s);

                if (b>0) {
                    System.out.println("定价" + b);
                  break;



                }else {
                    System.out.println("你输入的数据有问题，必须是正数");
                }
            } catch (NumberFormatException e) {
                System.out.println("你输入的数字有问题。请输入数字");
            }

        }











    }
}
