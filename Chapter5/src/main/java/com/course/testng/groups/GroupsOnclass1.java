package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnclass1 {

    public void student1(){
        System.out.println("这是在class1111的student1上运行！！");
    }

    public void student2(){
        System.out.println("这是在class1111的student2上运行！！");
    }
}
