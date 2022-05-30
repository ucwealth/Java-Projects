package com.cstore.model;

public class Customer {
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void buyProduct() {
        System.out.println("I can buy this product now! The name = "+product.getProductName());
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                ", emailAddress='" + emailAddress + '\'' +
//                ", qualifications='" + qualifications + '\'' +
//                '}';
//    }

}
