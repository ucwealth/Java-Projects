package Model;

import Enums.Category;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Store {
    private Product product;

    ArrayList<Product> ProductList = new ArrayList<>();

    public void readProductFile() throws IOException {
        try {
            File file = new File("src/main/resources/products.csv");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null) {
               String[] splitLine = line.split(",");
               product = new Product(Integer.parseInt(splitLine[0]), splitLine[1], Category.valueOf(splitLine[2].toUpperCase()), Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
               ProductList.add(product);
            }
        } catch(IOException ex) {
            throw new RuntimeException(ex);
        }

    }

    public void listProducts() {
        if(ProductList.size() > 0) {
            for(Product product : ProductList) {
                System.out.println(product);
            }
        } else {
            System.out.println("OUT OF STOCK!");
        }
    }

}
