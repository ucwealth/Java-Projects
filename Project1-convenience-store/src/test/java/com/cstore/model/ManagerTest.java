package com.cstore.model;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ManagerTest extends Staff {

    @org.junit.jupiter.api.Test
    void hireCashier() {
        Product myProduct = new Product("Yam");
        Cashier madu = new Cashier("Maduabuchi", myProduct);
        Manager manager = new Manager(madu);
        String output = manager.hireCashier();
        System.out.print(output);
        assertEquals("I just hired a cashier called Maduabuchi", output);
    }
}
