package com.basics.junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    @Before
    public void before() { // can init data
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass() { // can make a db connection
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }


    @Test
    public void sum_with3numbers() { // absence of failure is success
        System.out.println("Test 1");
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[] {1, 2, 3});
        assertEquals(6, result);
    }

    @Test
    public void sum_with1number() {
        System.out.println("Test 2");
        MyMath myMath = new MyMath();
        assertEquals(3, myMath.sum(new int[] {3}));
    }

}