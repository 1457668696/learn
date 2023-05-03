package com.wang.core.staticc.jingtai;
//静态工厂，用一个成员变量来储存对象，通过set方法注入属性，以后直接从静态工厂获取
public class FactoryStudent {
    public static Student creatStudent(String info){
        switch (info){
            case "zhangsan":
                Student z=new Student();
                z.setName("张三");
                return z;
            case "lisi":
                Student s=new Student();
                s.setName("李四");
                return s;
            default:
                return null;

        }

    }


}
