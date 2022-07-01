import Enums.Role;
import Model.Cashier;
import Model.Store;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Store RobanStores = new Store();
        RobanStores.readProductFile();
        RobanStores.listProducts();

        Cashier cashmoney = new Cashier("cashmoney", Role.CASHIER, RobanStores);
        cashmoney.sellProducts("peakMilk", 2);
        RobanStores.listProducts();
        cashmoney.dispenseReceipt();
        cashmoney.sellProducts("coke", 3);
        RobanStores.listProducts();
        cashmoney.sellProducts("peakMilk", 3);
        cashmoney.sellProducts("peakMilk", 2);
    }
}
