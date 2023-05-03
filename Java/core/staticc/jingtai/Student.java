package com.wang.core.staticc.jingtai;
//静态只能访问静态，实例都可以访问，静态无this
//实例成员属于对象的，所以不能直接访问。      静态是共享的，所以可以都访问，this为当前对象，无this
public class Student {
    private String name;         //实例成员变量       都是属于对象本身的，只有创建对象会加载

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public void study() {         //实例成员方法       只有对象才能调用，因为里面有成员变量
        System.out.println(name + "在好好学习");
    }

    public static int getMax(int a, int b) {        //静态方法，类和对象共享
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(getMax(20, 50));     //方法区静态方法已经随类加载，可以调用，本类可以省略不写
//        study();                                     //属于对象的方法，没有对象。无法访问
        Student s = new Student();
        s.name = "猪八戒";
        s.study();

        s.getMax(5, 6);//也可以通过对象调用静态，但是不推荐。不如用类名
        Student.getMax(5, 6);
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

    public String toString() {
        return "Student{name = " + name + "}";
    }
}
