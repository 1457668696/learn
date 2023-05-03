package com.wang.design.zuhe;


/*
*
* 子节点，只能打印
*
* */

public class MenuItem extends MenuComponent{

    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}











