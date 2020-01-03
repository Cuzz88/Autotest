package com.course.testng;

import org.testng.annotations.Test;


public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionFailed(){
        System.out.println("这是失败的异常测试");
    }

 //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();

    }
}
