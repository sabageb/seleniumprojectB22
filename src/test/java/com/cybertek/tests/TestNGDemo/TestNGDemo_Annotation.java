package com.cybertek.tests.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGDemo_Annotation {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");

    }

@BeforeTest
public void beforeTest(){
    System.out.println("Before test");
}
@BeforeClass
public void beforeClass(){
    System.out.println("Before class");
}

@BeforeMethod
    public void setup(){
    System.out.println("Before method");
}
    @Test(priority = 3)
    public void test1() {
        String word1 = "java";
        String word2 = "java";
        System.out.println("Test3");
        Assert.assertEquals(word1, word2);

    }
  //  @Ignore// this will comment out-it will NOT be print out -> Will be IGNORED
    @Test(priority = 2)
    public void test2() {
        //if assert comes FALSE it will not run further. It will print EXceptionHandle
        String word1 = "javascript";
        String word2 = "javascript";
        System.out.println("Test2");
        Assert.assertEquals(word1, word2);//if False-STOP HERE. It`ll not run @Aftermethod
    }
    @Test(priority = 1)
    public void test3(){
    Assert.assertTrue(15 > 10);

    }
    @AfterMethod
public void teardown(){
        System.out.println("After method");


}

@AfterClass
    public void afterClass(){
    System.out.println("After class");
}
@AfterTest
    public void afterTest(){
    System.out.println("After test");

}
@AfterSuite
    public void afterSuite(){
    System.out.println("After Suite");
}
}
