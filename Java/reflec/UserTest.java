package com.wang.reflec;



import lombok.extern.slf4j.Slf4j;
import org.junit.Test;


@Slf4j
public class UserTest {


@Test
public void test() throws ClassNotFoundException, InstantiationException, IllegalAccessException {


        log.info("根据类名:  \t" + User.class);


        System.out.println("根据类名de:  \t" + User.class);


        log.info("根据对象:  \t" + new User().getClass());


        log.info("根据全限定类名:\t" + Class.forName("com.wang.reflec.User"));



        // 常用的方法
         log.info("获取全限定类名:\t" + User.class.getName());
       log.info("获取类名:\t" + User.class.getSimpleName());
      log.info("实例化:\t" + User.class.newInstance());

      //内部类，数组形式会会不一样
    log.info("更详细的输出:\t" + User.class.getCanonicalName());



    }
}