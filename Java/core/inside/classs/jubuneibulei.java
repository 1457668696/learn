package com.wang.core.inside.classs;

public class jubuneibulei {
    public static void main(String[] args) {
//局部内部，无用，在main里面定义了，又new对象，

        class Cat {
            private String name;
            private int a;


            public Cat() {
            }

            public Cat(String name, int a) {
                this.name = name;
                this.a = a;
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
             * @return a
             */
            public int getA() {
                return a;
            }

            /**
             * 设置
             * @param a
             */
            public void setA(int a) {
                this.a = a;
            }

            public String toString() {
                return "Cat{name = " + name + ", a = " + a + "}";
            }


        }
        Cat c = new Cat();
          c.setName("小玖");
        System.out.println(c.getName());
    }
}