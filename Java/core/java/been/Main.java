package com.wang.core.java.been;

public class Main {
    public static void main(String[] args) {
        JavaBeen a=new JavaBeen();
        System.out.println(a);
        a.setAge(56);                //方法都在栈内存执行，内容都存在堆内存，通过引用a去找到JavaBeen类的东西。
    }                                //对象之间的赋值都是地址，地址一致，访问改变的内容相同。如果把null赋值给这个引用，就会断开和对象额链接，系统会回收堆空间的对象


}
