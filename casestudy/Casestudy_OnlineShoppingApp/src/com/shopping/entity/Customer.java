package com.shopping.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    private String address;
    private List<Order> orders = new ArrayList<>();

    public Customer(int userId, String username, String email, String address) {
        super(userId, username, email);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}