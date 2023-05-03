package com.wang.core.abstracts.card;

public class Test {
    public static void main(String[] args) {
        GoldCard c=new GoldCard();
        c.setUsername("张山");
        c.setMoney(2000);
        c.pay(1000);

        System.out.println("-------------------------------");
        GoldCard d=new GoldCard();
        d.setMoney(2000);
        d.setUsername("李四");
        d.pay(1000);
    }
}
