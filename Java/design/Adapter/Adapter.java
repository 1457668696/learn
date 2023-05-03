package com.wang.design.Adapter;

/**
 * 适配器让原本接口不兼容的类可以合作无间。
 *
 * */
public class Adapter implements Cat{

    Dog dog;

    public Adapter(Dog dog){
       this.dog=dog;
    }


    @Override
    public void meow() {
        dog.bark();
    }
}
