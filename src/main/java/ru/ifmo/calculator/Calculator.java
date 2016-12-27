package ru.ifmo.calculator;

import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Created by xmitya on 27.12.16.
 */
public class Calculator {
    public double calculate(String expression) {
        expression = expression.replaceAll("[\t\n ]", "") + "=";

        String operator = "*/+-=";

        StringTokenizer tokenizer = new StringTokenizer(expression, operator, true);

        Deque<String> operatorStack = new LinkedList<>();
        Deque<String> valueStack = new LinkedList<>();

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            if(!operator.contains(token))
                valueStack.push(token);
            else
                operatorStack.push(token);

            resolve(valueStack, operatorStack);
        }

        String lastOne = valueStack.pop();

        return Double.parseDouble(lastOne);
    }

    private int getPriority(String op) {
        switch (op) {
            case "*":
            case "/":
                return 1;

            case "+":
            case "-":
                return 2;

            case "=":
                return 3;

            default:
                return Integer.MIN_VALUE;
        }
    }

    private void resolve(Deque<String> values, Deque<String> operators) {
        while (operators.size() >= 2) {
            String first = operators.pop();
            String second = operators.pop();

            if (getPriority(first) < getPriority(second)) {
                operators.push(second);
                operators.push(first);

                return;
            }
            else {
                String firstValue = values.pop();
                String secondValue = values.pop();

                values.push(getResults(secondValue, second, firstValue));
                operators.push(first);
            }
        }
    }

    private String getResults(String operand1, String operator, String operand2) {
        double op1 = Double.parseDouble(operand1);
        double op2 = Double.parseDouble(operand2);

        switch (operator) {
            case "*":
                return "" + (op1 * op2);

            case "/":
                return "" + (op1 / op2);

            case "+":
                return "" + (op1 + op2);

            case "-":
                return "" + (op1 - op2);

            default:
                return null;
        }
    }
}
