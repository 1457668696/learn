package com.wang.base.flow.control;

/**
 * 不知道循环几次，用while,珠穆朗玛峰厚
 */
public class While {
    public static void main(String[] args) {
        double s=8848860;
        double p=0.1;
        int count=0;
        while (s>p){
            p *=2;
            //翻倍
            count++;
            //记数
        }

        System.out.println("纸张的最终厚度"+p);
        System.out.println("折叠次数"+count);

        while (true){}
        //死循环

        //do while 先执行一次。
        //与for的区别，一个知道循环次数，一个变量可以继续使用（非局部变量）


    }



}
