package com.wang.exception;


import java.io.*;

/**
 * 作者：
 * 系统错误（IO error ,ThreadDeath,AssertionError,虚拟机错误，内存不足，栈溢出等），无法捕获处理，也无法查
 * 编译非运行运行异常(IO exception sql,classnotfound)，不解决无法编译，可查
 * 运行时逻辑错误（IndexOutBoundException，IllegalArgument,NullPoint,ClassCast）。程序员失误导致的逻辑错误，不可查，经验
 */
public class ExceptionDemo {


    //1.不捕获，则要声明，在方法上throws 接异常名。无法处理就继续往上抛异常。FileNOtFoundException.这是编译前需要处理的，不可查不要这种方式
    public static void main(String[] args) throws IOException {
        File file = new File("E:2.txt");
        String result;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((result = reader.readLine()) != null) {
            System.out.println(result);


            //2.抛出异常，无法检查到的可能出出错，可以用这种方式抛出,不过Java已经和完善了，不需要自己抛出，一般只捕获或者声明就好
            //有时候从在catch中抛出，是为了多系统复杂异常无法觉察，方便暴露自己的特殊异常。
            test(0);


        }
    }


    //ArithmeticException
    public static double test(int value) {
        if (value == 0) {
            throw new ArithmeticException("参数不能为0");
        }
        return 5.0 / value;
    }

}
    //2.5 多个catch,记得优先捕获最具体的异常

   //3.控制留与异常。能用if解决的绝不要用异常。假如能用if

    //4.应该重用Java定义好的异常，有性能优化
    //5.自定义异常记得加入@throws myException 注解，且可以把原异常作为原因包装异常
    //6.抛出异常和记录日志是重复的尽量不要用。
    //7.尽量不要在finally中用return，因为会继续往下执行，会丢到返回点，有了return依然会执行finally
    /*
    *
    * private int x = 0;
public int checkReturn() {
    try {
        // x等于1，此处不返回
        return ++x;
    } finally {
        // 返回的结果是2
        return ++x;
    }
}
------
    //8.异常十分耗时，非必要不要抛出异常，创建异常。

   //9.两种资源释放方式，一种是try{}语句块，一种是在finally中.close



    //try catch 捕获详情见change类

      }






*/
