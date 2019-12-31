package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnmodel {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法1111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法2222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法3333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法4444");
    }

    @BeforeGroups("server")
    public void beforegroupsOnserver(){
        System.out.println("before groups 这是服务端组运行前!");
    }

    @AfterGroups("server")
    public void aftergroupsOnserver(){
        System.out.println("after groups 这是服务端运行后！");
    }

    @BeforeGroups("client")
    public void beforegroupsOnclient(){
        System.out.println("before groups 这是客户端组运行前!");
    }

    @AfterGroups("client")
    public void aftergroupsOnclient(){
        System.out.println("after groups 这是客户端运行后！");
    }




}
