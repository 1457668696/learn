package com.wang.core.abstracts.card;

/**
 * @author Administrator
 */
public class GoldCard extends Card {
    @Override
    public void pay(double money2) {
        System.out.println(getUsername()+"你当前消费"+money2);
        System.out.println(getUsername()+"你的余额为"+getMoney());
        double rs=money2*0.8;
        System.out.println(getUsername()+"你的实际消费"+rs);
        setMoney(getMoney()-rs);
        System.out.println(getUsername()+"你的余额为"+getMoney());



    }
}

