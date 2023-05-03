package com.wang.io;

import java.io.*;

public class Copy {
    public static void main(String[] args) {

                                                                                          //还有一种办法写在try()里面，使用完会自动关闭。有限使用这种
        try (
                InputStream is=new FileInputStream("D:\\60帧\\20.mp4");
                OutputStream os=new FileOutputStream("F:\\Program Files\\1.mp4");
                MyConnection m=new MyConnection();                         //资源都是实现了Closeable/AutoCloseable的的类对象

        ){
            byte[] b =new byte[1024];
            int len;
            System.out.println("正在复制中...");
            while ((len= is.read(b))!=-1){

            os.write(b,0,len);


                    }
            System.out.println("复制完成");

        } catch (IOException e) {
            e.printStackTrace();
//        }finally {                                       //最终执行代码，常用于资源回收，释放资源
//            System.out.println("有bug请测试");             //安全关闭isos流。但是在方法中尽量不要使用return或者其他赋值等操作，不然会以这个为准//
//                                                         //会让数据产生问题
//            try {
//                if (os!=null)os.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            try {
//                if (is!=null)is.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }                                       //除非是使用System.exit(0)虚拟机停止了才会不执行

        }


    }



    }
class MyConnection implements AutoCloseable{                         //资源都是实现了Closeable/AutoCloseable的的类对象
    @Override
    public void close(){
        System.out.println("资源成功释放");

    }
}


