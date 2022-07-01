package Services;

import Model.Product;

public interface CashierServices {
    public void sellProducts(String productName, int quantitySold);
    public void dispenseReceipt();
}
