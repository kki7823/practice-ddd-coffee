package com.kikim.practice.coffee.order;

import com.kikim.practice.coffee.commons.Price;

public class OrderLine {
    private Menu menu;
    private int quantity;
    private Price price;
    private Price amounts;

    public OrderLine(Menu menu, int quantity, Price amounts) {
        this.menu = menu;
        this.quantity = quantity;
        this.amounts = amounts;
    }

    public Price calculateAmounts() {
        return amounts.multipy(quantity);
    }

    public Price getAmount() {
        return amounts;
    }
}
