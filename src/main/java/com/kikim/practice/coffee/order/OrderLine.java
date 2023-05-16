package com.kikim.practice.coffee.order;

import com.kikim.practice.coffee.commons.Price;

public class OrderLine {
    private Menu menu;
    private int quantity;
    private Price amounts;

    public OrderLine(Menu menu, int quantity, Price amounts) {
        this.menu = menu;
        this.quantity = quantity;
        this.amounts = calculateAmounts();
    }

    public Price calculateAmounts() {
        return menu.calculatePrice(quantity);
    }

    public Price getAmount() {
        return amounts;
    }
}
