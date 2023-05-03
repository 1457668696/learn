package com.wang.core.staticc.jingtai;

import java.util.Random;

public class Codecheck {


    private Codecheck(){};       //由于工具类无需创建对象，建议私有化构造器，工具类




    public static String codecheck(int n){                   //通用方法应该封装成静态方法，随处可以通过类名.方法名调用
        String s="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";

        String code="";

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int index=random.nextInt(s.length());
            char c = s.charAt(index);
            code+=c;

        }




        return code;
    }




}
