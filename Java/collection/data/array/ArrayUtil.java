package com.wang.collection.data.array;

import java.util.Arrays;

//自己定义的工具类
public class ArrayUtil {


    public static String print(int[] arr){
        if (arr==null) {
            return null;}
            StringBuffer s = new StringBuffer("[");
            for (int i = 0; i < arr.length; i++) {
                s.append(arr[i]).append(i == arr.length - 1 ? "]" : ",");
            }


            return s.toString();
        }

    public static class Search {
        public static void main(String[] args) {
            int[] a = {56, 46, 45, 52, 12};
            int i = arraySearch(a, 555);
            System.out.println("你查询的值索引为" + i);
        }


        public static int arraySearch(int[] arr, int data) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == data) {
                    return i;
                }



            }
            return -1;
        }
    }

    /**
     * 动态数组合
     * @author Administrator
     */
    public static class ArraySum {
        public static void main(String[] args) {
            int[] a = {1, 5, 2, 3, 46};
            System.out.println(Arrays.toString(arrays(a)));


        }

        public static int[] arrays(int[] arr) {

            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i] + arr[i - 1];

            }


            return arr;
        }
    }
}
