package Model;

import Enums.Role;
import Services.ManagerServices;

public class Manager extends Person implements ManagerServices {
    private Cashier cashier;

    public Manager(String name, Role role, Cashier cashier) {
        super(name, role);
        this.cashier = cashier;
    }

    @Override
    public String hireCashier(Cashier cashier) {
        return "As the store manager, I have successfully hired "+ cashier.getName() + " as the new cashier. Welcome them!";
    }
}
