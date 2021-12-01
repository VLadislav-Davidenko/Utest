package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

public class CalcTest {

    @BeforeAll
    static void initAll(){
        System.out.println("initAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("afterAll");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("afterEach");
    }

    @Test
    public void calcTest(){
        System.out.println("This is test!!!");
        var calc = new Calc();

        int res = calc.calc(2, 3);
        Assertions.assertEquals(5,res, "Must be 5");
    }

    @Test
    public void failTest(){
        System.out.println("I worked");
        fail("I have done");
    }


    @Test
    @Disabled
    public void failTest2(){
        System.out.println("I worked");
        fail("I have done");
    }
}
