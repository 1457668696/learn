package com.wang.design.single;

public class Teacher {
    private Teacher(){};  //私有化
    private static Teacher teacher;

    public static Teacher getTeacher(){
        if(teacher==null){

            teacher=new Teacher();

        }
        return teacher;
    }
}
