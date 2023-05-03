package com.wang.design.Adapter;

public class Test {
    public static void main(String[] args) {


          Dog dog=new Dog1();
         Cat cat=new Adapter(dog);
         cat.meow();





    }





}
