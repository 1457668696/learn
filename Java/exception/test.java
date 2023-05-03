package com.wang.exception;

public class test {
    public static void main (String args[]){
        class S {
            public S(){};
            public static void eat() {
                System.out.println ("Error");
            }
        }



        System.out.println("程序开始");
        System.out.println ("Error");
        try {
            chu(5, 0);
        } catch (Exception e) {
            e.printStackTrace();                                 //一定要用e.printStackTrace（）打印异常才不会报错
            //在外层main方法用try catch捕获最安全？？？？
        }
        System.out.println("结束");



    }


    public static void chu(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        int c = a / b;
        System.out.println(c);


    }



}



