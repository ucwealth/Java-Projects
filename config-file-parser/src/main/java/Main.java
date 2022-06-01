import java.io.*;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String chosenFile = "";
        if(Objects.equals(args[0], "staging")) {
           chosenFile = "../resources/config.txt.staging";
        } else if(Objects.equals(args[0], "dev")) {
            chosenFile = "../resources/config.txt.dev";
        } else if(Objects.equals(args[0], "")) {
            chosenFile = "../resources/config.txt";
        } else {
            System.out.println("Please enter the correct option!");
        }

        try {
            File file = new File(chosenFile);
            Scanner scan = new Scanner(file);

            HashMap<String, String> map = new HashMap<String, String>();
            while(scan.hasNextLine()) {
                String input = scan.nextLine();

                String[] splitInput = input.split("=");
                map.put(splitInput[0], splitInput[1]);
                System.out.println(map);
            }

        } catch (IOException e) {
            System.out.println("File not found...Check well chief!");
            throw new RuntimeException(e);
        }
//        ConfigParser config = new ConfigParser("");
    }

}

