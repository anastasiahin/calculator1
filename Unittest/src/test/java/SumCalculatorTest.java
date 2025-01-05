package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void testSumWithOne() {
        assertEquals(1, calculator.sum(1), "Sum of 1 should be 1");
    }

    @Test
    void testSumWithThree() {
        assertEquals(6, calculator.sum(3), "Sum of 1 + 2 + 3 should be 6");
    }

    @Test
    void testSumWithZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0),
                "Sum of 0 should throw IllegalArgumentException");
    }
}
