package com.wang.base.study.base;

/**
 * @author Administrator
 */
public class Operation {
    public static void main(String[] args) {
        //两个数相除还是整数，运算中最终结果以最高类型决定，除不尽就是0
        int a=12;
        int b=100;
        System.out.println(b/a);
        //也发生了自动类型转换
        System.out.println(10/3);
        System.out.println("--------------------------------------"
        );
        //取余数 %  取位数，利用舍小数，留余数的算法
int i=12345;
        int i2=i%10;
        System.out.println(i2);
        int i3=i/10 %10;
        System.out.println(i3);
        int i4=i/100 %10;
        System.out.println(i4);
        int i5=i/1000 %10;
        System.out.println(i5);
        int i6=i/10000 %10;
        System.out.println(i6);
// +号，能算就算，不能算就连接（尤其是在字符串中）     ++ —-单独使用一样，在前先赋值,在后先运算
        int o=10;
        int k=o++;
        System.out.println(k);
        System.out.println(o);
//赋值运算符，=+意味累加。使用赋值运算符的时候已经进行了强制类型转换，转为左边的数据类型
//关系运算符，== =！ >
//逻辑运算符号，&（有假必假） |（有真必真）！（取返）∧（都真为真，都假为假）
        //两个&&为短路，左边false右边不执行
        //两个||为短路，左右true右边不执行

        //三元运算符   条件式？值1： 值2;
        //                 true  false
        int b2=10;
        int c2=50;
        System.out.println(b2>c2?b2:c2);

        int a2=100;
        int temp=b2>c2?b2:c2;
        int max=a2>temp?a2:temp;
        System.out.println(max);


        //算术优先级，自己查，优先括号，自增，取反，运算。加减乘除再逻辑
    }
}
