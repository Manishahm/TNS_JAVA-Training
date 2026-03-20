package com.shopping.service;

import java.util.ArrayList;
import java.util.List;
import com.shopping.entity.Customer;

public class CustomerService {

    public static List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer c) {
        customers.add(c);
        System.out.println("Customer created successfully!");
    }

    public Customer getCustomerById(int id) {
        for(Customer c : customers) {
            if(c.getUserId() == id)
                return c;
        }
        return null;
    }

    public void viewCustomers() {
        for(Customer c : customers) {
            System.out.println("User ID: " + c.getUserId() +
                    ", Username: " + c.getUsername() +
                    ", Email: " + c.getEmail() +
                    ", Address: " + c.getAddress());
        }
    }
}