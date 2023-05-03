package com.wang.collection.data.array;



import java.util.Arrays;

public class suzu {
    public static void main(String[] args) {
        int[] a={1,9,6,89,6,4};
        System.out.println(Arrays.toString(a));
        //1.打印数组内容，Arrays.toString(name)的方法



        Arrays.sort(a);
        //排序sort,默认升序，那么怎么降序呢
        System.out.println(Arrays.toString(a));


        //二分查找（数组必须排序好）
        System.out.println(Arrays.binarySearch(a,90));

        //比较器对象，需要使用引用类型，通过使用对象来比较

       Integer[] i={1,5,6,1,5,4};
       Arrays.sort(i, (o1, o2) -> {
//              return 0;          //在比较器中返回0是不排序，返回正整数是升序，负整数是降序
           //如果认为左边数据大于右边 返回正整数
           //             小于右边 返回负整数
           //             等于     返回0
//              return o1-o2;        //默认升序，因为如果o1大于o2自然是正数，小于就在负数。
           return o2-o1;         //在前面加一个－号简化以后，就是相反的降序
       });
        System.out.println(Arrays.toString(i));


        Student[] s=new Student[3];
        s[0]=new Student("汪贤民",22,171.0);
        s[1]=new Student("韦桃",25,175.0);
        s[2]=new Student("叶芬",26,165);
        System.out.println(Arrays.toString(s));
        Arrays.sort(s, (o1, o2) -> {
//                return o1.getAge()-o2.getAge();      //年龄升序
//                return o2.getAge()-o1.getAge();       //年龄降序排序

//                return o2.getHeight()-o1.getHeight();     返回的不是整数，不能这样总比较，有自己特殊的比较器
//                return Double.compare(o1.getHeight(),o2.getHeight());  //升序
            return Double.compare(o2.getHeight(),o1.getHeight());
            //降序

        });
        System.out.println(Arrays.toString(s));



        int[] b={1,5,6,8,9,45,56,89,89,88};


        System.out.println(binarySesrch(b,9));
        //返回索引值
        System.out.println(binarySesrch(b,32));
        //返回未查找的-1








    }
    public  static int binarySesrch(int[] b,int data){                         //二分查找算法
        int left=0;                    // 左位置和右边位置
        int right=b.length-1;

        while (left<=right){
            int mid=(left+right)/2;         //取中间索引
            if (data>b[mid]){               //往右边找
                left=mid+1;

            }else if (data<b[mid]){         //往左边找
            right=mid-1;


            }else {
                return mid;
            }
//            int[] b={1,5,6,8,9,45,56,89,89,88};




        }




        return -1;
//       System.out.println("查无此数");
    }

    public static class Copy {
        public static void main(String[] args) {

            int a[]={0,1,2,3,4,5,6};
            int b[]={5,4,3,2,1,0,-1};
                        //被拷贝 拷贝位置 拷贝数组 粘贴位置 拷贝几个
            System.arraycopy(a,0,b,0,5);
            System.out.println(Arrays.toString(b));



        }
    }
}
