package com.wang.base.method.base;

/**
 * @author Administrator
 */
public class Value {
    public static void main(String[] args) {
        int a=10;
          a(a);
          //a方法执行完毕后，退出栈内存，此时的a指向main里面的10；简单来说就是只在栈内存，方法销毁后无。
//       a= a(a);
        System.out.println(a);
        System.out.println("------------------------");
        int[] b={10,20,30};
        //引用数据类型传递的是地址，改变的东西在堆内存，一直存在，所以值已经发生了改变
        print(b);
        System.out.println(b[0]);

    }
    public static void a(int a) {
        //基本类型的特征为   值传递！！！！ 不是变量赋值，不会改变变量本身.除非把返回值赋值给原来的变量
        System.out.println(a);
        a = 20;
        System.out.println(a);
//return a;


    }

    public static void print(int[] b){
        System.out.println(b[0]);
        b[0]=20;
        System.out.println(b[0]);

    }






}

