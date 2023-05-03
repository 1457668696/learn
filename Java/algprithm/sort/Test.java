package com.wang.algprithm.sort;

public class Test {


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("我是1号");
        s1.setAge(52);
        Student s2 = new Student();
        s2.setName("我是2号");
        s2.setAge(42);

        Comparable max = getMax(s1, s2);
        System.out.println(max);

    }

    public static Comparable getMax(Comparable c1, Comparable c2) {
        int result = c1.compareTo(c2);
        if (result >= 0) {         //等于0一样大，大于0，c1大，小于0，c2大
            return c1;
        } else {
            return c2;
        }


    }
}

