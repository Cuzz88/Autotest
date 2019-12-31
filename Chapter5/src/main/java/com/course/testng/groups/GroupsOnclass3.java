package com.course.testng.groups;

import org.testng.annotations.Test;



@Test(groups = "tercher")
public class GroupsOnclass3 {

        public void tercher1(){

            System.out.println("这是在class3333的tercher1上运行！！");
        }

        public void terche2(){
            System.out.println("这是在class3333的tercher2上运行！！");
        }
}
