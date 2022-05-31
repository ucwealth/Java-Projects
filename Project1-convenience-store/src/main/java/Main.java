import com.cstore.model.Applicant;
import com.cstore.model.Product;
import com.cstore.storeEnums.Qualification;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== Welcome to SuperStore =========");

        Product firstProduct = new Product(1, "Pomo", 1000.0);
        System.out.println(firstProduct.toString());

        Applicant newCashier = new Applicant("100", "Lauren German", 28, Qualification.BSc);
        System.out.println(newCashier.toString());
    }

}
