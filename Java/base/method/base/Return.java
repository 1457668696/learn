package com.wang.base.method.base;

/**
 * @author Administrator
 */
public class Return {
    public static void main(String[] args) {
        chu(10,0);
    }



    public static void chu(int a,int b){
        if(b==0){
            System.out.println("除数不能为0");
            return;
            //使用return结束本方法，回到main方法中
        }

         int c=a/b;
        System.out.println(c);


    }





}
