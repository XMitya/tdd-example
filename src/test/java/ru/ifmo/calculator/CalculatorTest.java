package ru.ifmo.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xmitya on 27.12.16.
 */
public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testPlus() {
        assertEquals(7.0, calc.calculate("2 + 5"), 0.0);
        assertEquals(10.0, calc.calculate("2 + 5 + 3"), 0.0);
    }

    @Test
    public void testMinus() {
        assertEquals(7.0, calc.calculate("10 - 3"), 0.0);
        assertEquals(2.0, calc.calculate("10 - 3 - 5"), 0.0);
    }

    @Test
    public void testMultiply() {
        assertEquals(4.0, calc.calculate("2 * 2"), 0.0);
        assertEquals(8.0, calc.calculate("4 * 2"), 0.0);
    }

    @Test
    public void testDivide() {
        assertEquals(4.0, calc.calculate("8 / 2"), 0.0);
        assertEquals(2.5, calc.calculate("5 / 2"), 0.0);
    }

    @Test
    public void testComplex() {
        assertEquals(24.0, calc.calculate("2 + 4 * 6 - 10 / 5"), 0.0);
    }
}