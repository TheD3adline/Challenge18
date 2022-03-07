package com.company;

public class Pen extends Product {

    public Pen(String productName, float price) {
        super(productName, price);
    }

    public void buyProduct() {
        System.out.print("You buy the " + productName + " for " + price);
    }
}
