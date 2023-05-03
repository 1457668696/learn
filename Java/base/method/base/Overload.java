package com.wang.base.method.base;                         //方法重载，名字相同，参数不同（类型，不是变量名），通过参数来区分不同。比如集合中的add方法
                                                           //修饰符、返回值类型都无所谓。

/**
 * @author Administrator
 * 方法重写和重载，重写内容，参数一致。重载方法，参数不一致
 */
public class Overload {
    public static void main(String[] args) {

    }
    public static void fire(){
        System.out.println("默认发射武器");
    }
    public static void fire(String location){
        System.out.println("给"+location+"发射武器");
    }


}
