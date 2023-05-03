package com.wang.core.duotai.jicheng;

public class tst {
    public static void main(String[] args) {

        ////最前面是什么就指向什么类。表面这个类的一个对象，右边是新建了一个对象。
        Animals a = new Cat();    // 猫是动物,具有动物的特性。调用eat方法。在这里猫当成动物看待。
        //把猫的对象的地址赋值给你动物a，但是a只能看到自己类动物类中的方法（包括子类重写的）

//        com.duotai.jicheng.dog b = new com.duotai.jicheng.dog();    //狗对象

        a.eat();               //因为是父类引用，看到的是父类中的方法eat。运行是优先使用子类重写的方法
        //指向了动物类，没有指向自己，自己是动物，就无法访问自己（猫）的特性act。


//        com.duotai.jicheng.Cat c = (com.duotai.jicheng.Cat) a;        //父类对象指向子类引用，把动物强行转换为猫（把动物转换成猫，你知道是猫，所以可以转。）
//        c.act();          //这个时候就可以调用猫中的方法了
//                             //把父类对象转化成了子类对象
        //对象的向下转型其实就是一个还原动作 。子类名 对象名=（子类名）父类对象 。 将父类对象还原成本类的子类对象。本来是猫，向上转型为动物，扩展自己的属性。再还原回来成为本来的猫

//        com.duotai.jicheng.Cat d = (com.duotai.jicheng.Cat) b;         //如果这里是把狗转成猫，那就会错误，因为狗没有猫的特性。
//            d.act();          //所以应该是子类先变成父类（猫成为动物）再变成子类（动物成为猫）。才不会错误
//
//
//        if (a instanceof com.duotai.jicheng.Cat) {     //判断动物a是不是猫，是就可以强转。
//
//            com.duotai.jicheng.Cat c=(com.duotai.jicheng.Cat)a;
//            c.act();
//
//
//        } else if (a instanceof com.duotai.jicheng.dog) { //不是猫就判断是不是狗，是狗就新建一个对象调用
//            com.duotai.jicheng.dog g = new com.duotai.jicheng.dog();
//            g.act();
////        }

//        b.act();                 // 通过b对象访问猫类的特殊属性


        }
    }

