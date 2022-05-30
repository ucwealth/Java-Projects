package com.cstore.model;

public class Manager extends Staff {
    private Cashier cashier;

    public Manager(Cashier cashier) {
        super();
        this.cashier = cashier;
    }

    public String hireCashier() {
        var resultString = "I just hired a cashier called " + cashier.getName();
//		System.out.println(resultString);
        return resultString;
    }

}
