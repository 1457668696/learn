package com.wang.algprithm.arrays;
/**
 *
 *把数组中的0移动到末尾
 *自己定义一个索引，从0开始，遍历，不等于0就留下赋值给新数组
 *如下，5.6.4.7.6分别占据了数组的前5位，索引为0.1.2.3.4，
 *此时判断自索引小于数组，补充数组，把0赋值过去
 * @author Administrator*/

public class MoveZeroes {
    public static void main(String[] args) {
      
        int[] a={5,6,0,4,7,6};
        moveZeroes(a);
    }



    public static void moveZeroes(int[] nums){
        //定义一个指针
       int idx=0;
       
        //遍历数组
        for(int num:nums){

            //从索引0开始。一直判断数组中非0的数值，非0就赋值给当前索引，为0的进入while循环，
            // 这里的idx可以理解成指针，不为0就的就依次留下，最后赋值给末尾
            if (num!=0){
                nums[idx++]=num;
            }
            }
              //给末尾赋值
              while (idx<nums.length){
                 nums[idx]=0;
        }
        }
    }






