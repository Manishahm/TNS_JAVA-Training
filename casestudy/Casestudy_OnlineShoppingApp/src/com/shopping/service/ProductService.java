package com.shopping.service;

import java.util.ArrayList;
import java.util.List;
import com.shopping.entity.Product;

public class ProductService {

    public static List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added successfully!");
    }

    public void removeProduct(int id) {
        products.removeIf(p -> p.getProductId() == id);
        System.out.println("Product removed!");
    }

    public Product getProductById(int id) {
        for(Product p : products) {
            if(p.getProductId() == id)
                return p;
        }
        return null;
    }

    public void viewProducts() {
        for(Product p : products)
            System.out.println(p);
    }
}