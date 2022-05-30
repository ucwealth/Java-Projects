package com.cstore.model;

public class Main {
    public static void main(String[] args) {

        System.out.println("We outside...");

        Product firstProduct = new Product(1, "Pomo", 1000.0);
        System.out.println(firstProduct.toString());
    }

}
