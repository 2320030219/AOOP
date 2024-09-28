package com.customerordersystem;

import java.util.Date;

public class Order implements Comparable<Order>, Cloneable {
    private int orderID;
    private String customerName;
    private double totalAmount;
    private Date orderDate;
    private String status;

    // Constructor
    public Order(int orderID, String customerName, double totalAmount, String status) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.orderDate = new Date();  // Automatically sets the current date
        this.status = status;
    }

    // Getters
    public int getOrderID() {
        return orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    // Override compareTo to sort based on total amount
    @Override
    public int compareTo(Order otherOrder) {
        return Double.compare(this.totalAmount, otherOrder.totalAmount);
    }

    // Cloneable implementation
    @Override
    public Order clone() throws CloneNotSupportedException {
        return (Order) super.clone();
    }

    @Override
    public String toString() {
        return "Order ID: " + orderID + ", Customer: " + customerName + ", Total: $" + totalAmount + ", Status: " + status;
    }
}
