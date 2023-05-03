package com.wang.core.inside.classs;

public class chenyuanneobulei
{
    private String aa;
    private static String bb;
   public class Inner{                //成员内部类，无Stict修饰，属于外部类的对象。格式为。。。。。。。。。。=new 外部类构造器（）.内部类构造器（）
       private String name;
       private int age;

       private static int a;                //JDK16开始支持静态类


       public Inner() {
       }

       public Inner(String name, int age, int a) {
           this.name = name;
           this.age = age;
           this.a = a;
       }

       /**
        * 获取
        * @return a
        */
       public static int getA() {
           return a;
       }

       /**
        * 设置
        * @param a
        */
       public static void setA(int a) {
           Inner.a = a;
       }

       /**
        * 获取
        * @return name
        */
       public String getName() {
           return name;
       }

       /**
        * 设置
        * @param name
        */
       public void setName(String name) {
           this.name = name;
       }

       /**
        * 获取
        * @return age
        */
       public int getAge() {
           return age;
       }

       /**
        * 设置
        * @param age
        */
       public void setAge(int age) {
           this.age = age;
       }

       public String toString() {
           return "Inner{name = " + name + ", age = " + age + ", a = " + a + "}";
       }


public void show(){
    System.out.println("测试");                 //在成员内部内可以直接访问外部类的实例变量，和Stict变量，因为是创建对象来访问的，但是如果变量名相同，就要三个层次，1.局部直接写，当前类成员用this，外部类用类名.this.name
    System.out.println(aa);
    System.out.println(bb);

    /////////////////////////////////成员变量面试题







}

   }










}
