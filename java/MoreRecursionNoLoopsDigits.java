import java.util.*;

class MoreRecursionNoLoopsDigits 
{

  public static void main(String[] args) 
  {
    // Put your name on this!!!
    System.out.println("Recursive Loops 2 - Written by Helen Zhou");
    System.out.println();
    System.out.println();

    System.out.println("The digits and the sum of the digits of a number.");  
    System.out.println();
    System.out.println();
    System.out.println();

    int number = 72348; 
    
    System.out.println(number);
    System.out.println("The digits from left to right are : ");
    printDigits(number);
    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("The digits from right to left are : ");
    printDigitsBackwards(number);
    System.out.println();
    System.out.println();
    System.out.println();

    System.out.print("The sum of the digits of the number is: ");
    int sum = getSumOfDigits(number);
    System.out.println(sum);
    System.out.println();
    System.out.println();

    System.out.println();
  } // end of Main method

  // print out the digits 1 by 1 with recursion from left to right
  public static void printDigits(int number)
  {
    if (number == 0)
    {
      return; // Base case: stop when we reach the end
    }
    printDigits(number / 10); // Recursive call with the number excluding the last digit
    System.out.print((number % 10) + " "); // Print the rightmost digit
  }

  // print out the digits 1 by 1 with recursion from right to left
  public static void printDigitsBackwards(int number)
  {
    if (number == 0)
    {
      return; // Base case: stop when all digits are printed
    }
    System.out.print((number % 10) + " "); // Print the rightmost digit first
    printDigitsBackwards(number / 10); // Recursive call with the number excluding the last digit
  }

  public static int getSumOfDigits(int number)
  {
    if (number == 0)
    {
      return 0; // Base case: sum of no digits is 0
    }
    return (number % 10) + getSumOfDigits(number / 10); // Add the rightmost digit to the sum of the rest
  }

} // end of class MoreRecursionNoLoopsDigits
