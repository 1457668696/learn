package com.wang.core.staticc.jingtai;

public class Demo {
    public static int onlinenumber=161;  //在线人数
    String name;

    Demo d=new Demo();



    public static void main(String[] args) {

        String c = com.wang.core.staticc.jingtai.Codecheck.codecheck(5);
        System.out.println(c);


        Student z = FactoryStudent.creatStudent("zhangsan");
        System.out.println(z.getName());


    }
   ;
    }
