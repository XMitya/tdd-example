package ru.ifmo.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.*;
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
        assertThat(7.0, equalTo(calc.calculate("2 + 5")));
        assertThat(10.0, equalTo(calc.calculate("2 + 5 + 3")));
    }

    @Test
    public void testMinus() {
        assertThat(7.0, equalTo(calc.calculate("10 - 3")));
        assertThat(2.0, equalTo(calc.calculate("10 - 3 - 5")));
    }

    @Test
    public void testMultiply() {
        assertThat(4.0, equalTo(calc.calculate("2 * 2")));
        assertThat(8.0, equalTo(calc.calculate("4 * 2")));
    }

    @Test
    public void testDivide() {
        assertThat(4.0, equalTo(calc.calculate("8 / 2")));
        assertThat(2.5, equalTo(calc.calculate("5 / 2")));
    }

    @Test
    public void testComplex() {
        assertThat(24.0, equalTo(calc.calculate("2 + 4 * 6 - 10 / 5")));
    }
}