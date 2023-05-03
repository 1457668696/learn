package com.wang.thread.pool;

import java.util.concurrent.*;

public class ThreadPool {


    public static void main(String[] args) {



        /**int corePoolSize,       核心线程
         int maximumPoolSize,      最大线程
         long keepAliveTime,       存活时间
         TimeUnit unit,            时间单位
         BlockingQueue<Runnable> workQueue,         工作队列（缓存队列）
         ThreadFactory:threadFactory,               线程工厂（创建对象）
         RejectedExecutionHandler handler) {        拒绝策略（超出限度）
         * */
        ExecutorService pool=new ThreadPoolExecutor(3,5,
                6,TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());


    Runnable runnable=new MyRunnable();


      //绑定三个
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);

        //开始放进任务队列
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);

        //开始创建临时线程,最多两个（max）
        pool.execute(runnable);
        pool.execute(runnable);

       //线程超出
//        pool.execute(runnable);
//        pool.execute(runnable);


        //关闭线程池子,1.直接中断任务，2.等待任务完成
        pool.shutdownNow();
        pool.shutdown();


    }



}
