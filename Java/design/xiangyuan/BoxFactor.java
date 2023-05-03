package com.wang.design.xiangyuan;

import java.util.HashMap;

/*
* 俄罗斯方块需要用的只是三个对象。
* 可以放进去一个工厂，可以单例模式。直接取出来
* 相当于单例模式的加强版，对于重复使用的对象。创建工厂或者池子。不过单例只能有一个线程，享元多个对象
* 注意对象的内部是不能改变的
*
*享元工厂
为了能更方便地访问各种享元， 你可以创建一个工厂方法来管理已有享元对象的缓存池。
* 工厂方法从客户端处接收目标享元对象的内在状态作为参数， 如果它能在缓存池中找到所需享元， 则将其返回给客户端；
* 如果没有找到， 它就会新建一个享元， 并将其添加到缓存池中。
* */



public class BoxFactor {

    private static HashMap<String,AbstractBox> map;


    //把对象引用放进map的value中
    private BoxFactor(){
        map=new HashMap<String,AbstractBox>();
        AbstractBox iBox = new IBox();
        AbstractBox lBox = new IBox();
        AbstractBox oBox = new IBox();
        map.put("I",iBox);
        map.put("L",lBox);
        map.put("O",oBox);

    }

    /*
    *
    * 把对象放进单例模式
    * */
    public static final BoxFactor getInstance(){

        return SingletonHolder.INSTANCE;
    }

    public static class SingletonHolder{
        private static final BoxFactor INSTANCE=new BoxFactor();

    }

    //根据形状取出盒子对象（就那三个）
    public AbstractBox getBox(String key){
        return map.get(key);

    }



}
