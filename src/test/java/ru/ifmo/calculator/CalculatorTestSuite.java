package ru.ifmo.calculator;

import junit.framework.TestSuite;

/**
 * Created by xmitya on 27.12.16.
 */
public class CalculatorTestSuite extends TestSuite {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite("Calculator test suite");

        suite.addTest(new TestSuite(CalculatorTest.class));
        suite.addTest(new TestSuite(MainTest.class));

        return suite;
    }
}
