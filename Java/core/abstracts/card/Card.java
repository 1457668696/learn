package com.wang.core.abstracts.card;
/**
 * 得到了抽象方法，失去了创建对象的能力，抽象类不一定有方法，抽象方法一定是抽象类。一个类如果继承了抽象类，必须重写抽象方法，否则定义成抽象类。
 * 不能使用abstract修饰变量，代码块，构造器，与final互斥，一个不能被继承，一个需要被继承
 * 此外还有一种模板方法，用于部分相同，部分不同，像写作文一样。设计出最终方法 final，即不能实现的定义成抽象方法，能实现的普通方法
 */
public abstract class Card {
    // 有抽象方法的必须是抽象类，意味不完整的设计图，交给子类实现重写
    private  String username;
    private double money;

    public abstract void pay(double money2);
    //没有方法体，无法使用无参构造器创建对象

    public Card() {
    }
    public Card(String username, double money) {
        this.username = username;
        this.money = money;
    }
    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    public String toString() {
        return "Card{username = " + username + ", money = " + money + "}";
    }
}
