package oop.mostenire;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
    @BeforeClass
    public void setUp(){
        System.out.println("Setup-ul din clasa BaseTest");
    }

    @BeforeMethod
    public void BaseTest(){
        System.out.println("Executare BaseTest");
    }

}
