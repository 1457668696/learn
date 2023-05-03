package com.wang.collection.data.array;

public class XuanzePaixu {
    public static void main(String[] args) {
        int[] a={5,1,3,2};
        //       0 1 2 3
        for (int i = 0; i < a.length-1; i++) {
            //i=0 ,j=1 2 3      比较三次交换
            //i=1 ,j=2 3        比较两次次交换
            //i=2 ,j=3          比较一次交换


            for (int j = i+1; j <a.length ; j++) {
                if (a[i] > a[j]){     //当前位置a[i] 占位a[j]
                    int temp=a[i];    //交换变量，建一个临时变量把当前的给他，
                    a[i]=a[j];       //然后把比较过的给当前的交换
                    a[j]=temp;        //交换回来


                }
                }
            }
        }
    }
