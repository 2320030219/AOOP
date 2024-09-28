package com.customerordersystem;

import java.util.Iterator;
import java.util.List;

public class OrderIterator implements Iterator<Order> {
    private List<Order> orders;
    private int index = 0;

    public OrderIterator(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean hasNext() {
        return index < orders.size();
    }

    @Override
    public Order next() {
        return orders.get(index++);
    }
}
