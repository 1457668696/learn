package com.wang.design.facade;


/**
 *类似进一步封装合适方法，提供一个接口对外共同访问
 * 正所谓。，访问一群接口
 *
 */
public class Facade {
    private WatchTv watchTv=new WatchTv();

    public void startTv(){
        watchTv.turnTv();
        watchTv.setCd();
        watchTv.watchTv();

    }

}
