package com.cstore.model;

public class Product {
    private int id;
    private String productName;
    private double price;
    public Product(int id, String productName, double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }
    public String setProductName(String productName) {
       return this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + productName + '\'' +
                ", price='" + price + '}';
    }

}
