package com.wang.jvm;

public class Main {

    private int m;

    public int inc() {
        return m + 1;
    }

}

//输入命令javap -verbose -p Main.class查看输出内容: