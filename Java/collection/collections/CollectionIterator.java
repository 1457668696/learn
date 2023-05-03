package com.wang.collection.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Administrator
 */
public class CollectionIterator {
    public static void main(String[] args) {
        Collection<String> a=new ArrayList<>();
        a.add("今天是国庆节");
        a.add("天气不错");
        a.add("不知道干嘛");
        a.add("在学习");
        System.out.println(a);
//     [今天是国庆节, 天气不错, 不知道干嘛, 在学习]
//          it
        System.out.println("--------------------------------------------");
        Iterator<String> it = a.iterator();
        //获取迭代器对象
//        System.out.println(it.next());
//     [今天是国庆节, 天气不错, 不知道干嘛, 在学习]
//                    it
//        System.out.println(it.next());
//     [今天是国庆节, 天气不错, 不知道干嘛, 在学习]
//                              it
//        System.out.println(it.next());
//     [今天是国庆节, 天气不错, 不知道干嘛, 在学习]
//                                      it
//        System.out.println(it.next());
//     [今天是国庆节, 天气不错, 不知道干嘛, 在学习]
//                                             it
//        System.out.println(it.next());
//数组越界，所以报错了，如果使用循环来遍历，需要加是否为空的判断


      while (it.hasNext()){
          //判断是否还有对象

    String s= it.next();
    System.out.println(s);

//    System.out.println(it.next());                //为什么不能直接这样遍历呢,而且在获得遍历器对象以后再添加数据会报错、越界
          //使用这种方式，有个隐患就是无法在迭代期间通过其他方式更改集合的内容了，不然就会报错

}


        System.out.println("-------------------------------");
      //foreach遍历       数据类型 名字：数组/集合
        for (String s:a) {
            System.out.println(s);
        }


        System.out.println("----------------------------------");
        //数组使用增强for          快捷键是name.for
        double[] scores ={52.26,59.5,38.8,99.2};
        for (double score : scores) {
            System.out.println(score);
        }
        System.out.println(Arrays.toString(scores));


        System.out.println("-------------------------------");







        //Lambda遍历                          其内部有个foreach遍历
//        a.forEach(new Consumer<String>() {            //匿名接口类
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        a.forEach(s -> {
            System.out.println(s);
        });
//        a.forEach(s -> System.out.println(s));   //简化代码
//        a.forEach(System.out::println);         //方法调用，更简洁













        }








    }

