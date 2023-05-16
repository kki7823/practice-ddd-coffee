package com.kikim.practice.coffee.order;

import java.util.List;

import com.kikim.practice.coffee.commons.Price;

public class Order {
    private List<OrderLine> orderLines;
    private OrderState state;
    private Price totalAmounts;

    public Order(List<OrderLine> orderLines) {
        setOrderLines(orderLines);
    }

    private void setOrderLines(List<OrderLine> orderLines) {
        varifyAtLeatsOneOrMoreOrderLines(orderLines);
        this.orderLines = orderLines;
        this.totalAmounts = calculateTotalAmounts();
    }

    private void varifyAtLeatsOneOrMoreOrderLines(List<OrderLine> orderLines) {
        if (orderLines == null || orderLines.isEmpty()) {
            throw new IllegalArgumentException("no OrderLine");
        }
    }

    private Price calculateTotalAmounts() {
        return new Price(orderLines.stream()
                .mapToInt(x -> x.getAmount().getValue())
                .sum());
    }
}
