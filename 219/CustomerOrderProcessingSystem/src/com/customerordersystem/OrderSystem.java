package com.customerordersystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderSystem {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create some orders
        Order order1 = new Order(1, "Alice", 150.50, "Processing");
        Order order2 = new Order(2, "Bob", 250.00, "Shipped");
        Order order3 = new Order(3, "Charlie", 100.75, "Delivered");

        // Clone an order
        Order clonedOrder = order1.clone();

        // Store orders in a list
        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);

        // Sort using Comparable (by total amount)
        Collections.sort(orderList);
        System.out.println("Orders sorted by total amount (Comparable):");
        for (Order order : orderList) {
            System.out.println(order);
        }

        // Sort using Comparator (by order date)
        Collections.sort(orderList, new OrderComparator());
        System.out.println("\nOrders sorted by order date (Comparator):");
        for (Order order : orderList) {
            System.out.println(order);
        }

        // Iterate over the orders using Iterator
        OrderIterator orderIterator = new OrderIterator(orderList);
        System.out.println("\nIterating over orders:");
        while (orderIterator.hasNext()) {
            System.out.println(orderIterator.next());
        }
    }
}
