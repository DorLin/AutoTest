package com.course.testng.suite;

import org.testng.annotations.*;

/**
 * @author : linwengang
 * create at:  2020/11/14  17:18
 * @description:
 */
public class BasicAnnotation {
    /**
     *
     * @param
     * @return void
     * @author linwengang
     * @date 2020/11/11 16:34
     */
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");

    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");

    }

    @BeforeMethod
    public void beforMethod(){
        System.out.println("beforMethod这是在@Test之前进行的");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod是在@Test之后进行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类运营之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类运营之后运行的方法");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest这是在beforeclass之前运行的方法");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest这是在afterclass之前运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
}
