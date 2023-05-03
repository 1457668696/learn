package com.wang.design.strategy;



/*环境（Context）类：持有一个策略类的引用，最终给客户端调用。*/
public class SalesMan {

    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //向客户展示促销活动
    public void salesManShow(){
        strategy.show();
    }


}
