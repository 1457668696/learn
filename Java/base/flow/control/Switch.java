package com.wang.base.flow.control;


import java.util.Scanner;

/**
 * 表达式只能是byte short int char jdk5支持枚举 7支持String。
 * 不能使用double、float、long，精度问题
 * 一定要写break跳出，不然会出现数据穿透、数据穿透也可以用来做事情
 * @author Administrator
 */
public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int m = scanner.nextInt();
        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(m + "月是31天");
            case 2 -> System.out.println(m + "月闰年是29天、非闰年为28天");
            case 4, 6, 9, 11 -> System.out.println(m + "月为30天");
            default -> System.out.println("输入有误、请输入1-12的数字");
        }


    }
}
