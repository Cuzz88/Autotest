package com.course.testng;
import org.testng.annotations.*;


public class BasicTest {

    @Test
    public void testCase1(){
        System.out.println("测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("测试用例2");

    }

    @AfterMethod
    public void afterMthod(){
        System.out.println("测试用例后运行");
    }

    @BeforeMethod
    public void beforMothod(){
        System.out.println("测试用例前运行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("类运行后");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("类前运行");
    }



}
