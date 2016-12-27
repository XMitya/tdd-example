package ru.ifmo.calculator;

/**
 * Created by xmitya on 27.12.16.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Result: " + calc.calculate(joinString(args)));
    }

    static String joinString(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (String arg : args)
            sb.append(arg);

        return sb.toString();
    }
}
