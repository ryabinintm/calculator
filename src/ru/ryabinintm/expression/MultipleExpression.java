package ru.ryabinintm.expression;

import java.net.Inet4Address;

public class MultipleExpression extends Expression {

    public MultipleExpression(String firstValue, String lastValue) {
        super(firstValue, lastValue);
    }

    @Override
    public String calculate() {
        firstValue = stringValid(firstValue);
        lastValue = numberValid(lastValue);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(lastValue); i++) {
            sb.append(firstValue);
        }
        return lengthValid(sb.toString());
    }
}
