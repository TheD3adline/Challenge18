package com.company;

public class Beer extends Product {

    public Beer(String productName, float price) {
        super(productName, price);
    }

    public void buyProduct() {
        System.out.print("You buy the " + productName + " for " + price);
    }
}
