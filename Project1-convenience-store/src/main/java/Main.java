import com.cstore.model.Applicant;
import com.cstore.model.Cashier;
import com.cstore.model.Product;
import com.cstore.storeEnums.Qualification;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("========== Welcome to SuperStore =========");

        Product.readProductFile();

        Applicant newCashier = new Applicant("100", "Lauren German", 28, Qualification.BSc);
        System.out.println(newCashier.toString());


        Product myProduct = new Product(2, "Eva Soap", "Soap", 10.05, 5);
        Cashier madu = new Cashier("Maduabuchi", myProduct);
    }

}
