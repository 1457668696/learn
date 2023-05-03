package com.wang.junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * @author Administrator
 */
public class HelloWorldTest {

  /**
   * 测试方法必须是public void，即公共、无返回数据。可以抛出异常。
   */
    @Test
    public void firstTest(){


        System.out.println("测试方法3");
        assertEquals(2,1+1);


    }


    /**
     * 所有方法执行前执行一次，且只执行一次
     */
    @BeforeClass
    public static void beforeClass() {
        System.out.println("此处通常用于准备工作，加载配置、数据库链接等");
    }



    /**
     * 会在所有方法执行结束后执行一次，且也只执行一次
     */
    @AfterClass
    public static void afterClass() {
        System.out.println("此处通常进行资源释放，回收，关闭等");
    }



    /**
     * 每个测试方法执行前执行一次,父类@Before修饰的方法会在子类@Before修饰的方法执行前 执行
     * 独立于用例的，不如之前创建了链接，下一个测试要读取一条数据，但是这个测试已经删除了，就可在此处插入一条
     */
    @Before
    public void before() {
        System.out.println("每个测试方法前都执行一次");
    }



    /**
     * 每个测试方法执行后执行一次,父类@After修饰的方法会在子类@After修饰的方法执行后执行。
     */
    @After
    public void after() {
        System.out.println("每次测试方式后都执行一次");
    }

    @Test
    public void testCase1() {
        System.out.println("测试方式1");
    }



    /**
     * 禁用测试
     */
    @Ignore
    @Test
    public void testCase2() {
        System.out.println("测试方法2");
    }




}
