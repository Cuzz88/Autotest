package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforesuite(){
        System.out.println("before suite 运行！");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite 运行！");

    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("before class 运行！");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("after class 运行！");
    }

    @BeforeTest
    public void beforetest(){
        System.out.println("beforetest 运行！");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("aftertest 运行！");
    }
}
