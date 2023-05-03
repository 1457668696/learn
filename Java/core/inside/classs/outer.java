package com.wang.core.inside.classs;

public class outer {

    public static String n;
    private String da;
              //内部静态类，特点是有static修饰，属于外部类本身，类的成分它都有，只是位置在别人里面而已。
              //使用构造方法创建对象的时候，格式为外部类名.内部类目 对象名=new 外部类名.内部类构造器。
public  static class Inner{
    private String name;
    private int age;
    public  static String schoolname;


    public Inner() {
    }

    public Inner(String name, int age, String schoolname) {
        this.name = name;
        this.age = age;
        this.schoolname = schoolname;
    }

    /**
     * 获取
     * @return schoolname
     */
    public static String getSchoolname() {
        return schoolname;
    }

    /**
     * 设置
     * @param schoolname
     */
    public static void setSchoolname(String schoolname) {
        Inner.schoolname = schoolname;
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
        return "Inner{name = " + name + ", age = " + age + ", schoolname = " + schoolname + "}";
    }



    public void show(){                                            //内部类可以直接访问静态成员变量
        System.out.println(n);
//        System.out.println(da);                                   //非静态的实例变量无法访问，除非设置成static或者new一个外部类对象再访问。
                                                                    //开发中应用比较少。了解即可

    }
}







}
