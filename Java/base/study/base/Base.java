package com.wang.base.study.base;

/**
 * println() 命令会在屏幕上打印文本，并添加一个特殊不可见的‘换行符’。这就是下一个文本从新行上开始的原因。
 * @author Administrator
 */
public class Base {

    public static void main(String[] args) {
        //数字写法
        System.out.println(1);
        System.out.println(1.0);

        System.out.println('K');
        //字符为只能为一个，单引号
        System.out.println(' ');
        //可以为空字符，不能为空
        System.out.println('\n');
        //换行   加上ln就是两次换行
        System.out.println('\t' + "Tab符号");
        //制表符

        System.out.println("Hello world!");
        //字符串双引号
        System.out.println("");
        //可以为空
        System.out.println(" ");
        //空字符


        System.out.println(true);
        System.out.println(false);

        System.out.println("--------------测试---------------------");
        String s = null;
        String st = "";
        //空和null有什么区别？
        System.out.println(s);
        System.out.println(st);
    }
}