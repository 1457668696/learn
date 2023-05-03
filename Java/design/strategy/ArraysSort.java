package com.wang.design.strategy;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {
    public static void main(String[] args) {
        Integer[] a={1,6,8,65,7};
        Arrays.sort(a, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });




    }









}
