package com.wang.base.method.base;             //提高复用性，逻辑更清晰。方法之间平级，无顺序，形参必须匹配。1.是否声明返回类型，2.是否需要形式参数

//方法先在方法区加载，先从main执行，遇到其他方法先暂停执行本方法，开始调用方法，执行完方法就从内存中退出去，继续执行本方法内容。方法区到栈内存



/**
 * @author Administrator
 */
public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(sum(5, 6, 7));
        //静态方法只能掉静态方法，静态方法一开始就加载了。
//     int a=  chen(5,6,7);
// 当方法需要被使用查看时，需要返回值。如get方法。set方法只是赋值，不需要返回值
        System.out.println();


    }


    public static int sum(int a, int b, int c) {      //只要写了写了返回值类型，内部也一定要return语句。
        return a + b + c;
//        System.out.println("这里的代码不会被执行");       //return也是结束语句，后边代码无用
    }

//    public static void chen(int a, int b, int c) {   //无返回结果，也无return
//        int f = a * b * c;
//
//
//    }
}