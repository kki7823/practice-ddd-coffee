package com.kikim.practice.coffee.commons;

public class Price {
    private int value;

    public Price(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Price multiply(int multiplier) {
        return new Price(value * multiplier);
    }

    public Price add(Price price) {
        return new Price(value + price.getValue());
    }

    public Price subtract(Price price) {
        return new Price(value - price.getValue());
    }
}
