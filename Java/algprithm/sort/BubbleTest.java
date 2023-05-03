package com.wang.algprithm.sort;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr={4,5,6,4,61,6};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));


        //数组的自带排序方法，十分繁琐，双轴，并归。只有排序过后的数组可以使用2分查找。
        Arrays.sort(arr);

    }



}
