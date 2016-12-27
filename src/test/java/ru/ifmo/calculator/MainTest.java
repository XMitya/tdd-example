package ru.ifmo.calculator;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by xmitya on 27.12.16.
 */
public class MainTest extends TestCase {
    public void testJoinString() throws Exception {
        String[] args = {"12", "+", "10", "-", "30", "*", "4"};

        assertEquals("12+10-30*4", Main.joinString(args));
    }

    public void testMain() throws Exception {
        PrintStream origOut = System.out;

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(bout);
        System.setOut(printStream);

        Main.main(new String[]{"2", "*", "5"});

        System.setOut(origOut);

        String res = new String(bout.toByteArray());

        assertEquals("Result: 10.0\n", res);
    }
}