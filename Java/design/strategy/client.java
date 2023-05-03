package com.wang.design.strategy;

public class client {
    public static void main(String[] args) {


        SalesMan salesMan=new SalesMan(new StrategyB());

        salesMan.salesManShow();

    }

}
