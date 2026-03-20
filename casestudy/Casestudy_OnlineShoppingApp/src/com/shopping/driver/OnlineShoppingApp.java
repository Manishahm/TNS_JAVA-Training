package com.shopping.driver;

import java.util.*;

import com.shopping.entity.*;
import com.shopping.service.*;

public class OnlineShoppingApp {

    static List<Admin> admins = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductService ps = new ProductService();
        CustomerService cs = new CustomerService();
        OrderService os = new OrderService();

        while(true) {

            System.out.println("\n1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch(choice) {

            case 1:
                adminMenu(sc, ps, os);
                break;

            case 2:
                customerMenu(sc, ps, cs, os);
                break;

            case 3:
                System.out.println("Exiting...");
                System.exit(0);
            }
        }
    }

    // ================= ADMIN MENU =================

    static void adminMenu(Scanner sc, ProductService ps, OrderService os) {

        while(true) {

            System.out.println("\nAdmin Menu");
            System.out.println("1 Add Product");
            System.out.println("2 Remove Product");
            System.out.println("3 View Products");
            System.out.println("4 Create Admin");
            System.out.println("5 View Admins");
            System.out.println("6 Update Order Status");
            System.out.println("7 View Orders");
            System.out.println("8 Return");

            int ch = sc.nextInt();

            switch(ch) {

            case 1:
                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Product Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Product Price: ");
                double price = sc.nextDouble();

                System.out.print("Enter Stock: ");
                int stock = sc.nextInt();

                ps.addProduct(new Product(id,name,price,stock));
                break;

            case 2:
                System.out.print("Enter Product ID: ");
                ps.removeProduct(sc.nextInt());
                break;

            case 3:
                ps.viewProducts();
                break;

            case 4:

                System.out.print("Enter Admin ID: ");
                int aid = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Admin Name: ");
                String aname = sc.nextLine();

                System.out.print("Enter Email: ");
                String aemail = sc.nextLine();

                Admin admin = new Admin(aid, aname, aemail);
                admins.add(admin);

                System.out.println("Admin created successfully!");
                break;

            case 5:

                System.out.println("Admins:");
                for(Admin a : admins){
                    System.out.println(a);
                }
                break;

            case 6:

                System.out.print("Enter Order ID: ");
                int oid = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter new status: ");
                String status = sc.nextLine();

                os.updateStatus(oid,status);
                break;

            case 7:
                os.viewOrders();
                break;

            case 8:
                return;
            }
        }
    }

    // ================= CUSTOMER MENU =================

    static void customerMenu(Scanner sc, ProductService ps, CustomerService cs, OrderService os) {

        while(true) {

            System.out.println("\nCustomer Menu");
            System.out.println("1 Create Customer");
            System.out.println("2 View Customers");
            System.out.println("3 Place Order");
            System.out.println("4 View Orders");
            System.out.println("5 View Products");
            System.out.println("6 Return");

            int ch = sc.nextInt();

            switch(ch) {

            case 1:

                System.out.print("Enter User ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Username: ");
                String name = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                System.out.print("Enter Address: ");
                String address = sc.nextLine();

                cs.addCustomer(new Customer(id,name,email,address));
                break;

            case 2:
                cs.viewCustomers();
                break;

            case 3:

                System.out.print("Enter Customer ID: ");
                int cid = sc.nextInt();

                Customer c = cs.getCustomerById(cid);

                if(c == null){
                    System.out.println("Customer not found!");
                    continue;
                }

                List<ProductQuantityPair> items = new ArrayList<>();

                while(true) {

                    System.out.print("Enter Product ID (-1 to stop): ");
                    int pid = sc.nextInt();

                    if(pid == -1)
                        break;

                    Product p = ps.getProductById(pid);

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    items.add(new ProductQuantityPair(p, qty));
                }

                os.placeOrder(c, items);
                break;
            case 4:
                os.viewOrders();
                break;

            case 5:
                ps.viewProducts();
                break;

            case 6:
                return;
            }
        }
    }
}