package com.wang.base.method.base;

/**
 * @author Administrator
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] a={5,65,656,56,45,12};
        System.out.println(getMax(a));

    }


    public static int getMax(int[] a){
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            if (max<a[i]){
                max=a[i];
            }
        }

        return max;
    }


}
