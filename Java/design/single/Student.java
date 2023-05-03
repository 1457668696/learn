package com.wang.design.single;
//单例模式，饿汉模式，使用类获取对象的时候，对象已经提前为你创建好了
//构造器私有
//把一个新建对象赋值给一个静态变量对象
public class Student {
    private Student(){};


    public static Student creatStudent=new Student();


}
