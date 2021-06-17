package com.cybertek.test.dAY7_TESTNG;

import org.testng.annotations.*;

public class beforeAfterMethod {

    @Test

    public void test1(){
        System.out.println("testing 1");
    }

    @Ignore

    public void test2(){
        System.out.println("second test");

    }
    @Test
    public void test3(){
        System.out.println("test3");

    }

    @BeforeMethod

    public void setup(){

    }

    @AfterMethod
    public void teardown(){
        System.out.println("after method is called");

    }
    @AfterClass

    public void tearup(){
        System.out.println("after class is called");

    }

}
