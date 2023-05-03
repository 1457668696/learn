package com.wang.thread;

import java.util.concurrent.Callable;
//Callable接口，是泛型接口，应该声明返回类型

/**
 * @author Administrator
 */
public class Thread3 implements Callable<String> {


    private int n;

    public Thread3(int n) {
        this.n = n;
    }







    @Override
    public String call() throws Exception {


int sum=0;
        for (int i = 0; i < n; i++) {
   sum+=i;
        }
        return "计算结果为"+sum;
    }
}
