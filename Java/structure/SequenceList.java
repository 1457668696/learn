package com.wang.structure;



public class SequenceList<T>{

    //存储元素的数组
    private T[] eles;

    //记录当前顺序表中的元素个数
    private int N;

    //构造方法
    public SequenceList(int capacity){
         eles=(T[]) new Object[capacity] ;
         N=0;

    }


    //清空表
    public void clear(){
        N=0;
    }

    //判断当前线性表是否为空表
    public boolean isEmpty(){
        return N==0;

    }

    //获取线性表的长度
    public int length(){
        return N;
    }

   //返回索引处的值
    public T get(int i) {
        if (i < 0 || i >= N) {
            throw new RuntimeException();
        }
     return eles[i];

    }

    //添加元素
    public void insert(T t){
        if(N== eles.length){
            throw new RuntimeException("当前表已满");
        }

        eles[N++]=t;

        }

        //在索引处插入元素T
        public void insert(int i,T t){
            if(N== eles.length){
                throw new RuntimeException("当前表已满");
            }
            if(i<0||i>N) {
                throw new RuntimeException("插入的位置不合法");
            }

            for (int index=N;index>i;index--){
                eles[index]=eles[index-1];
            }

            eles[i]=t;
//元素数量+1
            N++;
        }

    //删除指定位置i处的元素，并返回该元素
    public T remove(int i){
        if (i<0 || i>N-1){
            throw new RuntimeException("当前要删除的元素不存在");
        }
//记录i位置处的元素
        T result = eles[i];
//把i位置后面的元素都向前移动一位

//一般作为容器存储数据，都需要向外部提供遍历的方式，因此我们需要给顺序表提供遍历方式。
        for (int index=i;index<N-1;index++){
            eles[index]=eles[index+1];
        }
//当前元素数量-1
        N--;
        return result;
    }




    //查找t元素第一次出现的位置
    public int indexOf(T t){
        if(t==null){
            throw new RuntimeException("查找的元素不合法");
        }
        for (int i = 0; i < N; i++) {
            if (eles[i].equals(t)){
                return i;
            }
        }
        return -1;
    }



}