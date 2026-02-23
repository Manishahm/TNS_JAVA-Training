package org.tnsif.acc.c2tc.thiskeyworddemo;

class Product {
    double price;

    Product(double price) {
        this.price = price;
    }

    double calculateDiscount() {
        return this.price * 0.10;  // Apply 10% discount
    }

    double calculateFinalPrice() {
        return this.price - this.calculateDiscount();  // Call the discount method using 'this'
    }
}


public class ThisDemo2 {

	public static void main(String[] args) {
		Product product = new Product(400.0);
        
        System.out.println("Final Price: $" + product.calculateFinalPrice());
    }

	

}


