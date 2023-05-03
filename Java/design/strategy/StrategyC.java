package com.wang.design.strategy;

/*具体策略（Concrete Strategy）
实现了抽象策略定义的接口，提供具体的算法实现或行为。*/

public class StrategyC implements Strategy{

    @Override
    public void show() {
        System.out.println("买1000送电视");
    }
}
