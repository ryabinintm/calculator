package ru.ryabinintm.expression;

public class DivideExpression extends Expression {

    public DivideExpression(String firstValue, String lastValue) {
        super(firstValue, lastValue);
    }

    @Override
    public String calculate() {
        firstValue = stringValid(firstValue);
        lastValue = numberValid(lastValue);
        int trimSize = firstValue.length() / Integer.parseInt(lastValue);
        return  firstValue.substring(0, trimSize);
    }
}
