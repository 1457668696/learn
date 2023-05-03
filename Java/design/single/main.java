package com.wang.design.single;

public class main {

    public static void main(String[] args) {
        Student s1=Student.creatStudent;         //饿汉单例获取对象，已经提前创建了
        Student s2=Student.creatStudent;
        System.out.println(s1==s2);


        Teacher t1=Teacher.getTeacher();        //懒汉单例，需要对象的时候才创作
        Teacher t2=Teacher.getTeacher();
        System.out.println(t1==t2);


    }



}
