package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.example.Main.getFactorial;
import static org.testng.Assert.assertEquals;

public class Testng {
    @Test
    public void testFactorialPositiveNumber() {
        assertEquals(6, getFactorial(3));
    }
    @Test
    public void testFactorialZero() {
        assertEquals(1, getFactorial(0));
    }
    @Test
    public void testFactorialNegativeNumber() {
        assertEquals(0, getFactorial(-3));
    }
    @DataProvider(name = "Factorial")
    public static Object[][] factorialProvider() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 25}
        };
    } @Test(dataProvider = "Factorial")
    public void testFactorialWithDataProvider(int number, int expected) {
        assertEquals(expected, getFactorial(number));
    }

}
