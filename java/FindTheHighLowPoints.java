import java.io.*;
import java.util.*;

public class FindTheHighLowPoints {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("numbers.dat");
        Scanner fileScanner = new Scanner(inputFile);
        
        int numberOfLines = Integer.parseInt(fileScanner.nextLine().trim());
        
        System.out.println("High Points and Low Points");
        System.out.println("\nMy name is Helen Zhou\n");
        
        for (int i = 0; i < numberOfLines; i++) {
            String line = fileScanner.nextLine();
            String[] tokens = line.split(" ");
            List<Integer> numbers = new ArrayList<>();
            
            for (String token : tokens) {
                numbers.add(Integer.parseInt(token));
            }
            
            System.out.println(line);
            
            List<Integer> lowPoints = new ArrayList<>();
            List<Integer> highPoints = new ArrayList<>();
            
            for (int j = 1; j < numbers.size() - 1; j++) {
                int current = numbers.get(j);
                int prev = numbers.get(j - 1);
                int next = numbers.get(j + 1);
                
                if (current < prev && current < next) {
                    lowPoints.add(current);
                }
                
                if (current > prev && current > next) {
                    highPoints.add(current);
                }
            }
            
            if (lowPoints.isEmpty()) {
                System.out.println("Low Point:   None");
            } else if (lowPoints.size() == 1) {
                System.out.println("Low Point:   " + lowPoints.get(0));
            } else {
                System.out.print("Low Points:  ");
                for (int lp : lowPoints) {
                    System.out.print(lp + " ");
                }
                System.out.println();
            }
            
            if (highPoints.isEmpty()) {
                System.out.println("High Point:   None");
            } else if (highPoints.size() == 1) {
                System.out.println("High Point:   " + highPoints.get(0));
            } else {
                System.out.print("High Points: ");
                for (int hp : highPoints) {
                    System.out.print(hp + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
        fileScanner.close();
    }
}
