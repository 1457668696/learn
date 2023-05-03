package com.wang.apis.object;

import java.util.Objects;
/**
 * 实际上有更好用的比较方法Objects.equals，这个方法会判断是否为空,允许对象为空
 * @author Administrator
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student("汪贤民", 56, "喝水");
        Student s1 = new Student("汪贤民", 56, "喝水");
        System.out.println(s.toString());
        //默认返回com.object.Student@4eec7777 全限名加地址
                                                  //默认使用toString方法返回,他的意义就在于可以被重写，返回内容


        System.out.println(s==s1);
        //object类比较规则因为地址不同所以返回false，其实内容是相同的，这个适合就需要用内容比较，重写
        System.out.println(s.equals(s1));
        //重写equals方法比较内容就为true
        String a="你好";
        //请注意，String类已经重写了equals方法，所以会先判断两个是否同一对象，是就true，否则转换为字符组逐一比较
        String b="我好";
        System.out.println(a.equals(b));


        System.out.println(Objects.equals(s1,s));

    }
}
