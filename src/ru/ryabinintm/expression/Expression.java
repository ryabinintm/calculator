package ru.ryabinintm.expression;

public abstract class Expression {

    String firstValue;
    String lastValue;

    public Expression(String firstValue, String lastValue) {
        this.firstValue = firstValue;
        this.lastValue = lastValue;
    }

    public String stringValid(String value) {
        if(value.startsWith("\"") && value.endsWith("\"")
                && value.length() <= 12) {
            return value.replaceAll("\"", "");
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String numberValid(String value) {
        if(value.matches("[1-9]|10")) {
            return value;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String lengthValid(String value) {
        if(value.length() > 40) {
            value = value.substring(0, 40) + "...";
        }
        return value;
    }

    public abstract String calculate();

    public void display() {
        String format = String.format("\"%s\"", calculate());
        System.out.println(format);
    }
}
