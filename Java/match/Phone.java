package com.wang.match;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {

        chick();

        }




    public static  void chick() {

        while (true) {
            System.out.println("请输入手机号码");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if (s.matches("1[3-9]\\d{9}")) {
                //第一位匹配1，第二位匹配3-9，之后的是数字9个

                System.out.println("注册成功");
              break;

            } else {
                System.out.println("格式错误");
            }
        }


    }
}
