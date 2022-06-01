import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class ConfigParser {
    private static final HashMap<String, String> map = new HashMap<>();
    public ConfigParser(String filename, String[] args) {
        String extension = "";
        if(args.length < 1 || args[0].equalsIgnoreCase("production")) {
            System.out.println("You are in production environment");
        } else {
            if(args[0].equalsIgnoreCase("staging")) {
                System.out.println("You are in Staging Environment");
                extension = ".staging";
            } else if(args[0].equalsIgnoreCase("dev") || args[0].equalsIgnoreCase("development")) {
                System.out.println("You are in development environment.");
                extension = ".staging";
            } else {
                System.out.println("Wrong option provided!");
            }
        }

        File file = new File("src/main/resources/" + filename + extension );
        parseToMap(file);
        getConfigFileDetails();
    }

    public void parseToMap(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String prefix = "";
            int count = 0;

            while((line = br.readLine()) != null) {
                if(line.isEmpty()) {
                    prefix = "";
                } else if(line.startsWith("[")) {
                    count++;
                    prefix = line.substring(1, line.length() - 1) + (count > 1 ? count : "") + ".";

                } else {
                   String[] splitLine = line.split("=");
                   var keyMaker = prefix + splitLine[0];
                   map.put(keyMaker, splitLine[1]);
                }
            }


        } catch(IOException e) {
            System.out.println("File not found...Check well chief!");
            throw new RuntimeException(e);
        }
    }

    public void getConfigFileDetails() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("\nType 'All' too see all the contents of this file\nType a key to see it's value\nType 'q' to quit. ");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("All")) {
                for(String key : map.keySet()) {
                    System.out.println(key +" = "+ map.get(key));
                }
            } else if(map.containsKey(input.toLowerCase())) {
                System.out.println(input +" : "+map.get(input.toLowerCase()));
            } else if(input.equalsIgnoreCase("q")) {
                System.out.println("Ok, bye! Exit game!!");
                break;
            } else {
                System.out.println("I dont recognize this input. Please read the options below!");
            }
        }

    }

}