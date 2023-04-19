package com.example.vending_machine;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create some products
        Product coke = new Product("Coke", 1.25);
        Product chips = new Product("Chips", 0.75);
        Product candy = new Product("Candy", 0.50);
        Product fruit = new Product("fruit", 0.95);

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add products to the cart
        cart.addItem(coke);
        cart.addItem(chips);
        cart.addItem(candy);
        cart.addItem(fruit);

        // Remove a product from the cart
        cart.removeItem(chips);

        // Check if a product is in the cart
        System.out.println("Is Coke in cart? " + cart.checkItem(coke));
        System.out.println("Is Chips in cart? " + cart.checkItem(chips));

        // Checkout and display the total
        cart.checkout();
    }

    class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + " - $" + price;
        }
    }

    class ShoppingCart {
        private ArrayList<Product> items;

        public ShoppingCart() {
            items = new ArrayList<>();
        }

        public void addItem(Product product) {
            items.add(product);
        }

        public void removeItem(Product product) {
            items.remove(product);
        }

        public boolean checkItem(Product product) {
            return items.contains(product);
        }

        public void checkout() {
            double total = 0;
            System.out.println("Items in Cart:");
            for (Product product : items) {
                System.out.println(product.toString());
                total += product.getPrice();
            }
            System.out.println("Total: $" + total);
        }
    }
}
