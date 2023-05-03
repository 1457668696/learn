package com.wang.collection.collections.list;



import java.util.*;

public class LinkList1 {
    public static void main(String[] args) {
        //首尾操作极快，双链表加数组
        List<String> link = new LinkedList<>();
        //使用List多态无法使用独有方法,在多态中，继承，重写，向上转型即（父类引用指向子类对象），只能调用到来自父类的属性／行为，这是编译阶段在，要确认父类是不是有子类中重写的方法。即在父类的角度看子类，所有动物都可以玩游戏。因为这是向上转型（把小的赋值给大），把子类的对象地址指向了父类，可以通过这个父类引用调用共有的方法，，如果父类没有这个方法那就会编译报错，不过向下转型（子类引用指向父类对象，父类赋值给子类引用，就可以先通过子类中的方法，）就可以了，
        List<String> link2= new  ArrayList<>();

//        LinkedList link3=(LinkedList) link2;
//        强转的弊端
        //把Array强转成Link编译不报错，但是这俩不是子类继承关系，所以无法强行转换，应该做一个判断。
        if(link instanceof LinkedList) {
            LinkedList link1=(LinkedList)link;
            link1.addFirst("第一个");
            //栈，弹夹，先进后出
            link1.addFirst("第二个");
            //push内部有addF方法
            link1.addFirst("第三个");
            link1.addFirst("第四个");
            System.out.println(link1.getFirst());
            System.out.println(link1.removeFirst());
            //pop内部也有ref方法,取出并移除掉
//        link3.addFirst("第五个");
        } else if (link instanceof ArrayList) {
            ArrayList<String> a= new ArrayList<>();
            a.add("dd");
            System.out.println(a);
        }
        System.out.println(link);

        System.out.println(link);

        LinkedList<String> queue = new LinkedList<>();
        //排队从最后一个开始排
        queue.addLast("1号");
        queue.addLast("2号");
        //offerLast
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);
        System.out.println(queue.removeLast());
        System.out.println(queue);


    }

    public static class jhn {
        private String name;
        private int age;

        public jhn() {
        }

        public jhn(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public static void main(String[] args) {
            Student s=new Student();
            jhn a=new jhn();
            s.getAge();
            a.getAge();

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
            return "com.collection.list.LinkList1.jhn{name = " + name + ", age = " + age + "}";
        }
    }

    public static class Setdome {
        public static void main(String[] args) {
            Set<String> s=new HashSet<>();
            Set<String> a=new LinkedHashSet<>();
            s.add("第一个");
            s.add("第二个");
            s.add("第三个");
            s.add("第四个");
            s.add("第五个");
            s.add("第五个");
            a.add("第一个");
            a.add("第二个");
            a.add("第三个");
            a.add("第四个");
            a.add("第五个");
            a.add("第五个");
            System.out.println(s);              //无序、不重复、无索引 hash
            System.out.println(a);              //有序、不重复、无索引 LinkedHashSet
        }
    }
}
