package Model;

import Enums.Role;
import Services.CashierServices;

public class Cashier extends Person implements CashierServices {
    private Product product;
    private Store store;
    private Customer customer;
    public Cashier(String name, Role role, Store store) {
        super(name, role);
        this.store = store;
    }

    @Override
    public void sellProducts(String productName, int quantitySold) {
        int quantityLeft;
        for(Product product1: store.ProductList) {
            if(product1.getName().contains(productName)) {
                quantityLeft = product1.getQuantity() - quantitySold;
               if(product1.getQuantity() >= quantitySold) {
//                   quantityLeft = product1.getQuantity() - quantitySold;
                   product1.setQuantity(quantityLeft);
                   System.out.println(quantitySold + " pieces of "+productName+" sold! Quantity left is "+ quantityLeft);
//                   break;
               } else if (product1.getQuantity() > 0) {
                   System.out.println("We only have " +product1.getQuantity()+ " pieces of "+product1.getName()+ " left in the store. You would have to buy the rest elsewhere. ");
                   product1.setQuantity(quantityLeft);
               } else {
                   System.out.println(productName+" is currently OUT OF STOCK!!");
               }
            } else {
                continue;
            }
        }
    }

    @Override
    public void dispenseReceipt() {
        System.out.println("This is your receipt: ");
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "product=" + product +
                ", store=" + store +
                ", customer=" + customer +
                '}';
    }
}
