package com.wang.apis.lang.string;

/**
 * @author Administrator
 */
public class StringApi {
    /**
     * 10.20 为什么有特殊的Double.compare比较方法，
     * 因为需要返回的是正整数或者负整数才能排序，这个方法优化了返回整数
     * 因为String类型的内容放在堆内存中，对象经常变更，==不合适用来比较了
     * 特别引入equals来专注内容比较,用来做逻辑判断，验证。==更适合基本数据类型，也是逻辑。或者判断是否同一对象。compare更适合对象。且用于排序，可以通过做差值，倒或者正序
     */
    public static void main(String[] args) {
        String s="abc我爱你";
        String s1=new String("abc我爱你");
        System.out.println(s==s1);
        //false比较
        System.out.println(s.equals(s1));
        //true

        System.out.println(s.length());
        //长度length
        System.out.println(s.charAt(5));
        //返回索引处字符charAt
        for (int i = 0; i < s.length(); i++) {
            //遍历
            char c = s.charAt(i);
            System.out.print(c);
        }
        char[] chars = s.toCharArray();
        //转成字符数组toCharArray
        for (char c :chars
            //遍历数组
            ) {
            System.out.println(c);
        }

        String substring = s.substring(0, 5);
        //包前不包后,字符串截取substring
        System.out.println(substring);

        s.substring(5);
        //从当前截取到最后


        String replace = s.replace("abc", "韦桃");
        //replace
        System.out.println(replace);
        //字符串替换


        boolean b = s.contains("韦桃");
        //是否包含 contains
        System.out.println(b);

        boolean ab = s.startsWith("ab");
        //以什么开始startsWith
        System.out.println(ab);

        String name="王宝强,蒋欣,刘亦菲";
        String[] split = name.split(",");
        //分隔符
        for (String q:split
             ) {
            System.out.println(q);

        }


        String a="Hello";
        String b1="hello";
        String c="Hello12345";
        Object o=a;
        System.out.println(a.compareTo(b1));
        //比较字符串是否相同  返回的是a-b。Ascll中的编码差值 为72-104（首字母不同都是32）。哪个字符不同就返回哪个的差值.相同地返回长度差距。
        System.out.println(a.compareTo("hello"));
        //可接对象，可接数据
        System.out.println(a.compareToIgnoreCase(b1));
        //忽略大小写比较

        System.out.println(a.compareTo(o.toString()));
        //对象之间比较

        System.out.println(a.compareTo(c));
        //长度返回差值


//        以上是String类的比较方法，情况。还有三个数字类型的包装类也有compare方法。只能相同类型使用
    }



}
