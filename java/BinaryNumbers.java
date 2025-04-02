import java.util.*; // for Scanner and ArrayList
import java.io.*;   // for file input
import static java.lang.System.*; // so that you don't have to do System.out

public class BinaryNumbers {

  public static void main(String[] args) throws IOException {
    // print out Written by your name
    System.out.println("Written by Helen Zhou");

    // Initialize the ArrayList for storing binary place values
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(0, 1);    // 2^0
    numbers.add(1, 2);    // 2^1
    numbers.add(2, 4);    // 2^2
    numbers.add(3, 8);    // 2^3
    numbers.add(4, 16);   // 2^4
    numbers.add(5, 32);   // 2^5
    numbers.add(6, 64);   // 2^6
    numbers.add(7, 128);  // 2^7
    numbers.add(8, 256);  // 2^8

    // Create a new Scanner object to read from the file
    Scanner input = new Scanner(new File("binary.dat")); // reads in the data file   

    // Read the first line from the file and convert it to an integer
    int numLines = Integer.parseInt(input.nextLine()); // This is the number of binary numbers to read

    // Loop through each binary number
    for (int line = 0; line < numLines; line++) {
      String binary = input.nextLine(); // Read in the next binary number
      int sum = 0; // to accumulate the base 10 number
      int pos = 0; // track the position in the binary number

      // Loop through all characters in the binary string from right to left
      for (int i = binary.length() - 1; i >= 0; i--) {
        char bit = binary.charAt(i); // Get the current bit ('1' or '0')

        // If the bit is '1', add the corresponding place value to sum
        if (bit == '1') {
          sum += numbers.get(pos);
        }
        pos++; // Move to the next position (next place value)
      }

      // Print out the binary string and its base 10 conversion
      System.out.println("Binary: " + binary + " = " + sum);
    }

    input.close(); // Close the file scanner
  }
}

