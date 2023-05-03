package com.wang.apis.lang.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Administrator
 * 除了运算，比较也是Double.compare
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        double a=10.0;
        double b=3.0;
        System.out.println(a/b);

        //精度失真,在遇到除不尽的时候会报错
        BigDecimal b1 = BigDecimal.valueOf(a);
        BigDecimal b2 = BigDecimal.valueOf(b);

        //加入取小数，四舍五入
        BigDecimal c=b1.divide(b2,2, RoundingMode.HALF_UP);



        System.out.println(c);


    }
}
