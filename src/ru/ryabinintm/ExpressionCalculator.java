package ru.ryabinintm;

import ru.ryabinintm.expression.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionCalculator {

    Expression expression;

    public ExpressionCalculator() {
    }

    private Expression createExpression(String[] parts) {
        String firstValue = parts[0];
        String sign = parts[1];
        String lastValue = parts[2];
        switch (sign) {
            case "+": return new AddExpression(firstValue, lastValue);
            case "-": return new SubtractExpression(firstValue, lastValue);
            case "*": return new MultipleExpression(firstValue, lastValue);
            case "/": return new DivideExpression(firstValue, lastValue);
            default: throw new IllegalArgumentException();
        }
    }

    private String[] parse(String value) {
        String[] parts = new String[3];
        Pattern pattern = Pattern.compile("\"(?:[^\"]|\"\")+\"|[^ ]+");
        Matcher matcher = pattern.matcher(value);
        int index = 0;
        while (matcher.find()) {
            parts[index++] = matcher.group();
        }
        return parts;
    }

    public void calculate(String value) {
        String[] parts = parse(value);
        expression = createExpression(parts);
        expression.display();
    }
}
