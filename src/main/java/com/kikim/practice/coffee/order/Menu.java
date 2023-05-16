package com.kikim.practice.coffee.order;

import com.kikim.practice.coffee.commons.Price;

public class Menu {
    private String id;
    private String name;
    private Price price;

    public Menu(String name, Price price) {
        this.name = name;
        this.price = price;
    }

    public Price getPriceInfo() {
        return price;
    }

    public Price calculatePrice(int quantity) {
        return price.multiply(quantity);
    }
}
