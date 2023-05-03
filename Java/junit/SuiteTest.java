package com.wang.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * 套件测试
 * @author Administrator
 */

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {TimeoutTest.class,ExceptionTest.class,HelloWorldTest.class,AssertionTest.class}



)
public class SuiteTest {
}
