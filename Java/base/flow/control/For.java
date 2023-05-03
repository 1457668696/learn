package com.wang.base.flow.control;

/**
 * @author Administrator
 */
public class For {
    public static void main(String[] args) {

        int sum=0;
        for (int i = 0; i < 6; i++) {
            sum+= i;
        }
        System.out.println(sum);

//通过取余判断奇偶，求和。
        int sum1=0;
        for (int i = 0; i < 11; i++) {
            if(i%2==1) {
                sum1 += i;
            }
        }
        System.out.println(sum1);


//for (;;){     死循环
//
//    System.out.println("你好");
//}

        //镶嵌循环，外部循环一次，内部全部循环一次
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==2){
                    System.out.println("今天星期三，不用说");
                    break;
                }
                if (i==3){
                    continue;
                }
                System.out.println("我爱你");

            }
            System.out.println("-----------------");
        }
    }


    //break  跳出循环 不对if有用 其他循环以及Switch都有用
    //continue 跳过当前循环，只在循环中使用



}
