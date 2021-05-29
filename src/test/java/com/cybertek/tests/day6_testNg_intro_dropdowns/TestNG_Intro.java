package com.cybertek.tests.day6_testNg_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {



    @BeforeClass
    public void setupClASS(){
        System.out.println("------->Before class is running");
    }
    @AfterClass
    public void teardown(){
        System.out.println("------>After class is running");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("--->Before method is running.........");

    }
    @AfterMethod
    public void teardownMethod(){
        System.out.println("--->after method is running........");
    }
    @Test
    public void test1(){
        System.out.println("Running test 1 ....");

        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);


    }
@Test (priority = 2)
    public void test2() {
    System.out.println("Running test 2.....");

    //String actual = "apple";
    //String expected = "apple";

   // Assert.True(actual.equals(expected)){

    }



}



