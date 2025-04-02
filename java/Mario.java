import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mario {
    public static void main(String[] args) 
    {
        try {
            Scanner scanner = new Scanner(new File("mario.dat"));
            int testCases = scanner.nextInt();
            
            while (testCases-- > 0) 
            {
                int n = scanner.nextInt(); 
                String word = scanner.next(); 
                
                int wordLength = word.length();
                
                // Case 1: The integer is greater than the length of the word
                if (n > wordLength) 
                {
                    System.out.println("error");
                }
                // Case 2: The integer is more than half the length of the word
                else if (n > wordLength / 2) 
                {
                    System.out.println(new StringBuilder(word).reverse().toString());
                }
                // Case 3: Perform the swap and reverse operation
                else {
                    String frontPart = new StringBuilder(word.substring(0, n)).reverse().toString();
                    String middlePart = word.substring(n, wordLength - n);
                    String backPart = new StringBuilder(word.substring(wordLength - n)).reverse().toString();
                    
                    System.out.println(backPart + middlePart + frontPart);
                }
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        }
    }
}