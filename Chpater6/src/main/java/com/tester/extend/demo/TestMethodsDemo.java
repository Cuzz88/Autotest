package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,2);

    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
        Reporter.log("测试用例2通过");
    }

    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void logDemo(){
        Reporter.log("这是我自己的写得日志");
        throw new RuntimeException("这是我自己运行时的异常");

    }


}
