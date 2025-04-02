import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rebate {
    public static void main(String[] args) {
        try {
            Scanner fileScanner = new Scanner(new File("rebate.dat"));
            
            int numDataSets = fileScanner.nextInt();
            fileScanner.nextLine();  
            
            for (int i = 0; i < numDataSets; i++) {
                String studentName = fileScanner.nextLine();
                
                int numTransactions = fileScanner.nextInt();
                fileScanner.nextLine(); 
                
                double totalAmount = 0;
                for (int j = 0; j < numTransactions; j++) {
                    double transaction = fileScanner.nextDouble();
                    totalAmount += transaction;
                }
                fileScanner.nextLine();  
                                
                if (totalAmount < 0) {
                    System.out.printf("%-11s%3s%n", studentName, "BAD DATA");
                } else {
                    double rebate = totalAmount * 0.10;
                    int roundedRebate = (int) Math.ceil(rebate / 5.0) * 5;
                    System.out.printf("%-11s%3d%n", studentName, roundedRebate);
                }
            }
            
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
