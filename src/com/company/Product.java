package com.company;

public abstract class Product {

    protected String productName;
    protected float price;

    public Product(String productName, float price) {
        this.productName = productName;
        this.price = price;
    }

    public abstract void buyProduct();

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
