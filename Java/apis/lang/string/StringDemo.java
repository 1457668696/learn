package com.wang.apis.lang.string;     //常量池""直接赋值，为了节省内存资源。new的在堆内存，两个地方不一样。存一份，每次查找引用

/**
 * @author Administrator
 */
public class StringDemo {
    public static void main(String[] args) {
        String name="汪";
        name+="贤";
        //String name=name+"贤"；   注意这里是拼接成了一个新的地址，在堆内存中，赋给了name，name的地址变化了、原来的字符串没有变
        name+="民";
        //在拼接的时候，实际上在使用StringButter在不断创建新对象来舍弃原来的对象，性能差
        System.out.println(name);




                                        //初始化对象的几种方式
        String s="abc";
        //先在堆内存中常量池中创建abc，指向s，
        String s1="abc";
        //查找常量池是否有abc有就直接指向新引用。所以为true
        System.out.println(s==s1);

        String s3=new String();
        //无参构造，空内容，实际开发不用，为空
String s2=new String("abc");
//有参构造创建的对象地址都不一样，但是可以弃用
        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s==s2);
        //为false


        char[] c={'a','b','c','中'};
        String s4=new String(c);
        //根据字符组的内容创建对象，返回一个字符串对象（拼接）
        System.out.println(s4);

        byte[] b={48,59,59,46,32};
        String s5=new String(b);
        //自动转换为字符串字符
        System.out.println(s5);



        String s6=new String("abcd");
        //常量池“”中一个,new一个，创建两个对象
        String s7="";
        //不创建对象，常量池已经有了，直接查找指向


        String s8="abcde";
        String s9="a"+"b"+"c"+"d"+"e";
        //编译优化，直接编译时已经拼接成abcde了，都在常量池中所以相同







    }

    public static class StringBufferP {
        public static void main(String[] args) {
        int[] a={1,5,4,5,4};
            System.out.println(toString(a));




        }






        public static String toString(int[] arr){             //注意此方法已经封装成Array.toString静态方法，可以直接调用
            StringBuffer s=new StringBuffer("[");
            for (int i = 0; i < arr.length; i++) {
                s.append(arr[i]).append(i== arr.length-1?"]":",");
            }


            return s.toString();
        }
    }
}
