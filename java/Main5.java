/*Sum Digits Over and Over

Due by Monday, August 29 (110 points)

Program Name: Digits.java     

Input File: digits.dat

You have taken a recent interest into finding 
how small you can make a number through 
summing its digits over and over again until 
you are left with a single digit. For example, 
the digits of 8966 would sum into 29, which sums 
into 11, which sums to 2.  You must use a loop
and find the sum of the digits.

Input
=====
The first line will contain a single integer n 
that indicates the number of data sets that 
follow. Each data set will consist of a single 
integer, which will be greater than or equal to 
zero.

Output
======
Sum the digits of the given number over and over 
until you are left with a single integer, and then 
output that integer.


Input File (You will need to create digits.dat)
==============================================
5
13
8966
273
548702
12345
LEAVE THIS LINE BLANK


Example Output to Screen
========================
Sum of the Digits Over and Over

My name is XXXXXXX XXXXXXX

number=13
Sum=4
Answer=4

number=8966
Sum=29
Sum=11
Sum=2
Answer=2

number=273
Sum=12
Sum=3
Answer=3

number=548702
Sum=26
Sum=8
Answer=8

number=12345
Sum=15
Sum=6
Answer=6
*/

// Skeleton Code
import java.util.*;
import java.io.*;

class Main5 
{
  
  public static void main(String[] args) throws Exception
  {
    System.out.println("Sum of the Digits Over and Over");
    System.out.println();
    
    // PUT YOUR NAME HERE!!!!!!!!!!!!!!!!!!
    System.out.println("My name is Helen Zhou");
    System.out.println();

    // You will need to create the file digits.dat  
    // This will allow you to read from the file
    // named digit.dat
    Scanner file = new Scanner(new File("digits.dat"));

    // Read in the number of data sets
    int numDataSets = file.nextInt();
    file.nextLine();
    
    // We will loop through each data set
    for (int n = 0;  n < numDataSets; n++)
    {
        // Read in the number from the file
        int number = file.nextInt();
        
        System.out.println("number="+number);
        file.nextLine();

        // Set your sum to zero
        int sum = 0;

        
        // number mod 10 would give you the
        // right most digit.
        // number / 10 would give you the
        // left digits.
        // Example: 
        // 2347 % 10 would give you 7
        // 2347 / 10 would give you 234
        // add the right most digit to your sum
        // loop until you reach a single digit
        // for the sum of the digits.
        
        boolean singleDigitSum = false;
        
        while (!singleDigitSum)
        {
          
          // while your number is greater than zero
          sum = 0;
      
          while(number > 0)
          {
            // get the rightDigit of number
            int rightDigit = number % 10;

            // Add the rightDigit to your sum
            // to get a new value for sum
            sum += rightDigit;

            // update your number so that the
            // right most digit is no longer there.
            number = number/10;
          }

          System.out.println ("Sum="+sum);
          
          // see if the sum is between 0 and 9 inclusive
          if (sum >= 0 && sum<=9)
          {
            // We are done, so set
            // singleDigitSum to true
            singleDigitSum = true;
          }
          else
          {
            // since we did not get a single digit sum,
            // set your number to the sum
            number=sum;

            // reset your sum back to zero
            sum=0;
          }
          
        } // end of while (!singleDigitSum)
        
        
        // println "Answer=" + the single digit sum
        System.out.println("Answer=" + sum);
        
        // print a blank line
        System.out.println();

        
    } // end of for 
    
    System.out.println();
    System.out.println();
  } // end of main method

} // end of class Main