package com.wang.core.inside.classs;

public class nimingneibuei {
    //没有名字的局部内部类，定义在方法中、代码块中，不用新建对象也可也直接访问。
    public static void main(String[] args) {
//        Animal a = new Animal() {                          //新建一个动物对象，然后不用再写其子类，直接在内部写重写方法，就会优先调用这个重写方法。
//                                                           //相当于new这个类的子类对象。
//            @Override
//            public void run() {
//
//                System.out.println("老虎跑的快");
//            }
//    };                                                 //
//        a.run();

        swim a = ()->{System.out.println("老虎跑的快");};               //使用lambable，简化代码，把方法名之后的代码块直接覆盖new，同时->指向。，只有函数式接口
        go(a);                                                       //（）表示一个新的匿名内部类，因为只有一个抽象方法所以也可以省略。
        go(()->{System.out.println("老虎跑的快");});                  //甚至不能new对象赋值，直接作为参数使用
    }
public static void go(swim s){
    System.out.println("开始游泳");
    s.swima();
    System.out.println("游泳结束");


}
}





//class Tiger extends Animal{
//    public void run(){};
//
//}


class Animal{
    public void run(){


    }







}
@FunctionalInterface         //一旦加上这个注解必须是函数式接口，里面只能有一个抽象方法
interface swim{
    void swima();


}