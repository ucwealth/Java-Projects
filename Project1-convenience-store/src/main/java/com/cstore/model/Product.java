package com.cstore.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Product {
    private int id;
    private String productName;
    private String productType;
    private double price;
    private int quantity;
    public Product(int id, String productName, String productType,  double price, int quantity) {
        this.id = id;
        this.productName = productName;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }
    public String setProductName(String productName) {
        return this.productName = productName;
    }

    public static void readProductFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/products.csv"));
        String line = "";
        var productArray = new ArrayList<Product>();

        try {
            while((line = br.readLine()) != null) {
                String[] lineArray = line.split(",");
                var aProduct = new Product(Integer.parseInt(lineArray[0]), lineArray[1], lineArray[2], Double.parseDouble(lineArray[3]), Integer.parseInt(lineArray[4]));
                productArray.add(aProduct);
            }
            System.out.println(productArray);

        } catch(Exception e) {

        }

    }




    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + productName + '\'' +
                ", type='" + productType + '\'' +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + "'}";
    }

}
