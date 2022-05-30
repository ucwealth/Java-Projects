package com.cstore.model;

public class Cashier extends Staff {
    private String name;
    private Product product;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Cashier(String name, Product product) {
        super();
        this.name = name;
        this.product = product;
    }


    // sellProducts() and dispenseReceipt()
    public void sellProducts() {
        System.out.println("I just sold a product named: "+product.getProductName() );
    }

    public void dispenseReceipt() {
        System.out.println("Please take your receipt!");
    }

}
