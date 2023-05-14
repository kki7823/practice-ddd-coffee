package com.kikim.practice.coffee.order;

import java.util.List;

import com.kikim.practice.coffee.commons.Price;

public class Order {
    private List<OrderLine> orderLines;
    private OrderState state;
    private Price totalPrice;
}
