package com.wang.annotation;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
@Slf4j
public class AA {

    class A{
        public void test() {

        }
    }

    class B extends A{

        /**
         * 重载父类的test方法
         */
        @Override
        public void test() {
        }

        /**
         * 被弃用的方法
         */
        @Deprecated
        public void oldMethod() {
        }

        /**
         * 忽略告警
         *
         * @return
         */
        @SuppressWarnings("rawtypes")
        public List processList() {
            List list = new ArrayList();
            return list;
        }





    }

    @Test
    public void testgame(){

        System.out.println("我是一个测试方法");

    }


    public void testlog(){

        log.info("我是一个日志方法");

    }





}
