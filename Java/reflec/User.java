package com.wang.reflec;

public class User {
    private String name="你好把";
    private int age;


    public User() {
    }

    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{name = " + name + ", age = " + age + "}";
    }
}
