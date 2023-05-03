package com.wang.jvm;



/**
 *
 *
 * 虚引用用于对象内部之间存在强行引用，
 * */
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class Phantom {
    public static void main(String[] args) {

        Object obj=new Object();

        ReferenceQueue<Object> rq=new ReferenceQueue<Object>();

        //虚引用，
        PhantomReference<Object> pr=new PhantomReference<Object>(obj,rq);


        System.out.println(pr.get());



    }
}
