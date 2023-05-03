package com.wang.core.inside.classs;

public class People {
    private int heartbeat=150;

    public class Heart{
        public  int heartbeat=110;

        public void show(){
            int heartbeat=78;
            System.out.println(heartbeat);      //78          局部变量就近原则
            System.out.println(this.heartbeat); //110         成员变量用this
            System.out.println(People.this.heartbeat); //150  外部类变量用类名加this加变量名（访问外部类的 成员变量）



        }




    }



}
