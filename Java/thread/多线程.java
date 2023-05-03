package com.wang.thread;



/**
 *
 *并发：一个处理器快速切换执行每个线程，达到同时运行的作用
 *并行：核心处理器一次能够处理的线程，6核12线程。
 *
 *
 *
 *
 * 1.NEW:创建对象
 * 2.Runnable:调用start方法后，等待cpu并行
 * 3.BLOCKED:阻塞，无法获取锁。正在等待排他锁释放
 * 4.WAITING:无限期等待，直到被打断或者唤醒
 * 5.TIME_WAITING:限期等待，时间到就能获取锁，sleep不用，wait需要获取
 * 6.TERMINATED:死亡，所有线程运行完毕
 *
 *
 *
 */



















public class 多线程 {
}
