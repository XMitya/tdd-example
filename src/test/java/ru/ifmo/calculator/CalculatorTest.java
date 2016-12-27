package ru.ifmo.calculator;

import junit.framework.TestCase;

/**
 * Created by xmitya on 27.12.16.
 */
public class CalculatorTest extends TestCase {

    public void testPlus() {
        Calculator calc = new Calculator();

        assertEquals(7.0, calc.calculate("2 + 5"));
        assertEquals(10.0, calc.calculate("2 + 5 + 3"));
    }

    public void testMinus() {
        Calculator calc = new Calculator();

        assertEquals(7.0, calc.calculate("10 - 3"));
        assertEquals(2.0, calc.calculate("10 - 3 - 5"));
    }

    public void testMultiply() {
        Calculator calc = new Calculator();

        assertEquals(4.0, calc.calculate("2 * 2"));
        assertEquals(8.0, calc.calculate("4 * 2"));
    }

    public void testDivide() {
        Calculator calc = new Calculator();

        assertEquals(4.0, calc.calculate("8 / 2"));
        assertEquals(2.5, calc.calculate("5 / 2"));
    }

    public void testComplex() {
        Calculator calc = new Calculator();

        assertEquals(24.0, calc.calculate("2 + 4 * 6 - 10 / 5"));
    }
}