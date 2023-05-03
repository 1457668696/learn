package com.wang.io;

import java.io.*;

public class BufferDemo {
    public static void main(String[] args) {
        try (

                Reader fr=new FileReader("E:\\1.txt");
                //字符输入流
                BufferedReader br=new BufferedReader(fr);
                //把低级地输入流包装给高级缓冲字符流流
                ){

           String line;
           while ((line=br.readLine())!=null){
               //按行读取
               System.out.println(line);

           }
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
