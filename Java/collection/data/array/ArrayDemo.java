package com.wang.collection.data.array;

import java.util.Random;
import java.util.Scanner;

/**
 * 引用类型
 */
public class ArrayDemo {
    public static void main(String[] args) {

        int[] a = {1, 5, 6, 2, 9, 8};
        //已经元素用动态化初始数组。开辟空间，栈空间存引用a,new开辟空间堆内存存放数组数据且有一个地址。
        String[] s = new String[3];
        //未知元素静态化初始数组，长度为三，堆空间内为默认值char等为0,浮点0.0字符串String为null，false
        System.out.println(s[0]);
        System.out.println(a);
        //数组地址
        System.out.println("第五个数字为" + a[4] + "");
        //数组索引
        for (int i = 0; i < a.length; i++) {
            //数组遍历，或者写成小于等于length-1（元素大于0）。因为是从0开始
            System.out.print(a[i]);
        }

        //数组求和，这里可以封装成方法。
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("");
        System.out.println("数组求和为" + sum);

        //数组求最大值,第一个作为默认值，逐一比较，大的赋值给max
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("最大值为" + max);

        //随机动态数组,猜数组
        int[] data = new int[5];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(20) + 1;
        }
        Scanner scanner = new Scanner(System.in);
        OUT:
        //结束整个循环
        while (true) {
            System.out.println("请输入一个数字");
            int g = scanner.nextInt();

            for (int i = 0; i < data.length; i++) {
                if (g == data[i]) {
                    System.out.println("恭喜你猜中了" + "这是数组中的第" + i + "个元素");
                    break OUT;
                }
            }


                    System.out.println("你猜错了");
                    for (int j = 0; j < data.length; j++) {
                        System.out.print(data[j]+"\t");}
                    }


        //打乱数组顺序
        int[] codes=new int[5];
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请你输入第"+i+1+"员工的工号");
           int code= scanner.nextInt();
           codes[i]=code;
        }

        Random random1 = new Random();

        for (int i = 0; i < codes.length; i++) {

           int r= random1.nextInt(codes.length);

           //有点看不懂!!!!!!!!!!!!!!!!!!!!!!!还有冒泡排序
           int temp=codes[r];
           //当前遍历值codes[i]          随机索引值codes[r]     实现交换
           codes[r]=codes[i];
           codes[i]=temp;

        }
        System.out.print("当前数组为");
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);
       }

    }

    public static class Print {
        public static void main(String[] args) {
            int[] a = {1, 5, 6, 56, 56, 46, 45};
            int[] c = {};
            int[] d = null;
            printArray(a);
            printArray(c);
            printArray(d);
        }

        public static void printArray(int[] arr) {


            if (arr != null && arr.length > 0) {                 //判断非空或者null
                System.out.print("[");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");       //三元表达式优化，括号

                }
                System.out.println("]");
            } else {
                System.out.println("请不要输入空数组或者null");
            }


        }

    }
}





