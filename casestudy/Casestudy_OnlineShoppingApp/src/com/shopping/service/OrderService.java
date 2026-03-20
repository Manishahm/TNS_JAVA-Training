package com.shopping.service;

import java.util.ArrayList;
import java.util.List;

import com.shopping.entity.*;

public class OrderService {

    public static List<Order> orders = new ArrayList<>();
    private static int orderCounter = 1;

    public void placeOrder(Customer customer, List<ProductQuantityPair> items) {

        Order order = new Order(orderCounter++, customer, items);
        orders.add(order);
        customer.addOrder(order);

        System.out.println("Order placed successfully!");
    }

    public void viewOrders() {
        for(Order o : orders) {
            System.out.println("Order ID: " + o.getOrderId()
                    + ", Customer: " + o.getCustomer().getUsername()
                    + ", Status: " + o.getStatus());

            for(ProductQuantityPair pq : o.getProducts()) {
                System.out.println(" Product: " + pq.getProduct().getName()
                        + ", Quantity: " + pq.getQuantity());
            }
        }
    }

    public void updateStatus(int orderId, String status) {
        for(Order o : orders) {
            if(o.getOrderId() == orderId) {
                o.setStatus(status);
            }
        }
    }
}