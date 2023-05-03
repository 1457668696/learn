package com.wang.apis.object;

import java.util.Objects;

public class Student {
    private String name;
    private  int age;
    private String hobby;

    public Student() {
    }

    public Student(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
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

    /**
     * 获取
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", hobby = " + hobby + "}";
    }


//    @Override
    public boolean equals(Object o) {                      //重写equals比较自己类的比较规则
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(hobby, student.hobby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hobby);
    }
}
