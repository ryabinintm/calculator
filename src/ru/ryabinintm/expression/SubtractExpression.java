package ru.ryabinintm.expression;

public class SubtractExpression extends Expression {

    public SubtractExpression(String firstValue, String lastValue) {
        super(firstValue, lastValue);
    }

    @Override
    public String calculate() {
        firstValue = stringValid(firstValue);
        lastValue = stringValid(lastValue);
        return firstValue.replaceFirst(lastValue, "");
    }
}
