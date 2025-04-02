import java.io.File;
import java.io.*;
import java.util.*;

public class Hop {
    public static void main(String[] args) {
        try {
            File inputFile = new File("hop.dat");
            Scanner scanner = new Scanner(inputFile);

            int n = Integer.parseInt(scanner.nextLine());
            int goodLeadCount = 0;

            for (int i = 0; i < n; i++) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ", 2);
                String location = parts[0];
                String message = parts[1];

                if (message.toLowerCase().contains(location.toLowerCase())) {
                    System.out.println("Good Lead");
                    goodLeadCount++;
                } else {
                    System.out.println("Bad Lead");
                }
            }

            System.out.println(goodLeadCount);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file 'hop.dat' not found.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}

