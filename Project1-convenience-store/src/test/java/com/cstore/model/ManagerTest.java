package com.cstore.model;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ManagerTest extends Staff {

    @org.junit.jupiter.api.Test
    void hireCashier() {
        Product myProduct = new Product(2, "Yam Flour", 3500.50 );
        Cashier madu = new Cashier("Maduabuchi", myProduct);
        Applicant newCashier = new Applicant(9, "Victor NewMan", 56, "None");
        Manager manager = new Manager();
        String output = manager.hireCashier();
        System.out.print(output);
        assertEquals("I just hired a cashier called Maduabuchi", output);
    }
}
