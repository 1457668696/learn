package com.wang.core.inside.classs;


public class Main {
    public static void main(String[] args) {
      outer.Inner out=new outer.Inner();
      out.setAge(23);
        System.out.println(out.getAge());                                       //静态内部类，属于外部类本身，不能访问非静态的成员变量，除非新建外部类对象来访问或者设置成stict
        System.out.println("------------------分割线------------------------");
        chenyuanneobulei.Inner out1=new chenyuanneobulei().new Inner();         //成员内部类，属于外部类对象，因为是通过对象访问，所以可以直接访问成员变量（包括stick）
        out1.setAge(56);                                                        //从现实来说，这种更好，因为对象是有层次的
        System.out.println(out1.getAge());
        System.out.println("-----------------分割线-----------------------------");









    }
}