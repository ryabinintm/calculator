package ru.ryabinintm.expression;

public class AddExpression extends Expression {

    public AddExpression(String firstValue, String lastValue) {
        super(firstValue, lastValue);
    }

    @Override
    public String calculate() {
        firstValue = stringValid(firstValue);
        lastValue = stringValid(lastValue);
        return firstValue + lastValue;
    }
}
