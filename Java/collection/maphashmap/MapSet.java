package com.wang.collection.maphashmap;





import com.wang.collection.data.array.Student;

import java.util.*;


public class MapSet {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        //无序、不重复（键）、无索引，值不做要求。重复的值会覆盖
        Map<String, Integer> a = new LinkedHashMap<>();
        //有序
        Map<String, Integer> z = new TreeMap<>();
        //可排序
        m.put("特步", 50);
        m.put("鸿星尔克", 50);
        //添加
        m.put("阿迪达斯", 60);
        System.out.println(m);
//        m.clear();
//       清空集合
//        System.out.println(m);
        System.out.println(m.isEmpty());
        //是否为空
        System.out.println(m.get("特步"));
        //根据键取值
        m.remove("阿迪达斯");
        //移除键，值也会消失
        System.out.println(m);
        System.out.println(m.containsKey("鸿星尔克"));
        //是否包含某个元素
        System.out.println(m.containsValue(60));
        //是否包含某个值
        Set<String> strings = m.keySet();
        //取得键的集合，并把他赋给集合Set，都是无序，不重复，无索引
        System.out.println(strings);


        Collection<Integer> values = m.values();
        //取得值的集合，赋值给Collection，是可重复的
        System.out.println(values);

        System.out.println(m.size());
        //集合大小

//        m.putAll(m2); 把m2集合添加到m中，后来的会覆盖原来的。

//遍历
        //1.键找值
        Set<String> strings1 = m.keySet();
        //把键的集合赋给Set集合
        for (String s : strings1
        ) {
            int value = m.get(s);
            System.out.println(s + value);

        }

//2.把Map的元素作为一个对象封装到Set里面
        Set<Map.Entry<String, Integer>> entries = m.entrySet();
      for (Map.Entry<String, Integer> entry:entries){
          String key=entry.getKey();
          int value=entry.getValue();
          System.out.println(key+value);


          /*
foreach遍历，内部有entry遍历
m.forEach(new BiConsumer<String, Integer>() {
    @Override
    public void accept(String s, Integer integer) {
        System.out.println(key+value);
    }
});
*/
      }

    }

    public static class demo3s {
        public static void main(String[] args) {
            Set<Student> s=new HashSet<>();
            Student s1=new Student("汪贤民",50, '男');
            Student s2=new Student("汪贤民",50, '男');
            Student s3=new Student("汪贤",50, '男');

            System.out.println(s1.hashCode());            //通过重写的方法可以判断hash一致
            System.out.println(s2.hashCode());
            System.out.println(s3.hashCode());

            s.add(s1);
            s.add(s2);
            s.add(s3);
            System.out.println(s);
        }
    }

    public static class TestTome {
        public static void main(String[] args) {
            Collection<Movie> movies=new ArrayList<>();
            movies.add(new Movie("《人潮汹涌》",9.8,"刘德华、万茜"));
            movies.add(new Movie("《釜山行》",8.8,"孔刘"));
            movies.add(new Movie("《龙珠超-布罗利》",9.7,"孙悟空、布罗利"));

            for (Movie s :movies ) {                        //这里的数据类型是一个类，即引用数据类型，包括多种类型，所以也要写成Movie
                System.out.println(s);
                System.out.println("-----------------------");

            }

    /*
            Iterator<com.map-hashmap.MAPst.Movie> it = movies.iterator();
            while (it.hasNext()){
                com.map-hashmap.MAPst.Movie s=it.next();                             // 这里的类型也要改
                System.out.println(s);


            }

            movies.forEach(System.out::println);               //输入对象名.foreach方法以后,在括号里面写soutc会自动输出最简格式

           movies.forEach(s->{
        System.out.println(s);
    });
    */
        }





    }

    public static class Movie {
    private String name;
    private double score;
    private String actor;

        public Movie() {
        }

        public Movie(String name, double score, String actor) {
            this.name = name;
            this.score = score;
            this.actor = actor;

        }

        /**
         * 获取
         * @return name
         */
        public String getName() {
            return name;
        }

        /**
         * 设置
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 获取
         * @return score
         */
        public double getScore() {
            return score;
        }

        /**
         * 设置
         * @param score
         */
        public void setScore(double score) {
            this.score = score;
        }

        /**
         * 获取
         * @return actor
         */
        public String getActor() {
            return actor;
        }

        /**
         * 设置
         * @param actor
         */
        public void setActor(String actor) {
            this.actor = actor;
        }

        public String toString() {
            return "电影名：" + name + "\r\n分数：" + score + "\r\n演员 ：" + actor ;
        }
    }
}