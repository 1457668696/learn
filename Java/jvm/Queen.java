package com.wang.jvm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/**
 *
 *
 * 保存收回后的对象信息队列
 * */
public class Queen {
    public static void main(String[] args) throws InterruptedException {

        Object obj=new Object();
        ReferenceQueue<Object> rq=new ReferenceQueue<Object>();
        WeakReference<Object> pr=new WeakReference<Object>(obj,rq);

        //有无对象排队
        System.out.println(pr.isEnqueued());

        //有无可用对象
        System.out.println(rq.poll());

         obj=null;
         System.gc();
         Thread.sleep(1000);

         //对象被回收，进行排队
        System.out.println(pr.isEnqueued());

        //取出队列内容
        System.out.println(rq.poll());

    }
}
