package com.wang.collection.collections.set;

public class apple implements Comparable<apple>{
    private String name;
    private String color;
    private double price;
    private int weight;

    public apple() {
    }

    public apple(String name, String color, double price, int weight) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.weight = weight;
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
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * 设置
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return "com.collection.set.apple{name = " + name + ", color = " + color + ", price = " + price + ", weight = " + weight + "}";
    }

    @Override
    public int compareTo(apple o) {
        //按重量，第一个比第二个大则返回正整数，小于返回负整数。相同返回0
        return this.weight-o.weight>0?1:-1;               //接口的实现方法通过比较当前对象和传入对象的比较。三元运算符，大于等于0可以保留
        //不包括0则去重复
    }
}
