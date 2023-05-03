package com.wang.core.java.been;                     //一个java文件可以有多个类，但是只有一个能public修饰

public class JavaBeen {                         //大驼峰
    private String name;                                //一般无需指定默认值，默认值0 0.0 false null   ，小驼峰
    private String address;                             //这个可不能直接赋值，如果设置成public，很容易被修改。
    private int age;
    private double score;

    public JavaBeen() {                     //构造器的作用是初始化一个类的对象，并返回对象的地址
    }

    public JavaBeen(String name, String address, int age, double score) {       //如果自己定义了有参构造器，无参构造就默认没有了，需要自己写
        this.name = name;                           //this代表当前对象的地址，用于指定访问当前对象的成员方法，成员变量
        this.address = address;
        this.age = age;
        this.score = score;
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
     */
    public void setName(String name) {           //这里还可以做判断，传入的参数是否正确

            this.name = name;

    }
    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     */
    public void setAddress(String address) {
        this.address = address;
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
     */
    public void setAge(int age) {
        if (age < 0 && age > 150) {
            this.age = age;
        }else {
            System.out.println("你的数据有问题");

        }
    }

    /**
     * 获取
     * @return score
     */
    public double getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return "JavaBeen{name = " + name + ", address = " + address + ", age = " + age + ", score = " + score + "}";
    }
}
