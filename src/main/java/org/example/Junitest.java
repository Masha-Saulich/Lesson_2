package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.example.Main.getFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class Junitest {
    @Test
    void testFactorialPositiveNumber() {
        assertEquals(6, getFactorial(3));
    }

    @Test
    void testFactorialNegativeNumber() {
        assertEquals(24, getFactorial(-5));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, getFactorial(0));
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,1",
            "2,2",
            "3,6",
            "4,24",
            "5,120",
            "6,720",
            "7,5040",
            "8,40320",
            "9,362880",
            "10,3628800"})
    void testFactorialPositiveNumberWithParam(int input, int expected) {
        assertEquals(expected, getFactorial(input));
    }
}




