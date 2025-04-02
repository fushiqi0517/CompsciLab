import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CirPrime {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("CirPrime.dat"));
            int n = scanner.nextInt();
            System.out.println("Circular Primes\n");
            System.out.println("Written by Helen Zhou\n");
            
            for (int i = 0; i < n; i++) {
                int number = scanner.nextInt();
                if (isCircularPrime(number)) {
                    System.out.println(number + "      is a circular prime.");
                } else if (isPrime(number)) {
                    System.out.println(number + "      is NOT a circular prime, but it is prime.");
                } else {
                    System.out.println(number + "      is a composite number.");
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isCircularPrime(int num) {
        String numStr = String.valueOf(num);
        int len = numStr.length();
        for (int i = 0; i < len; i++) {
            if (!isPrime(Integer.parseInt(numStr))) {
                return false;
            }
            numStr = numStr.substring(1) + numStr.charAt(0);
        }
        return true;
    }
}