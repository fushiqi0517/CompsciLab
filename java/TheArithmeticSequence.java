import java.util.*;

class TheArithmeticSequence {
  public static void main(String[] args) 
  {
    // Create a Scanner object to read from 
    // the keyboard.
    Scanner input = new Scanner(System.in);
    
    // Create an ArrayList object to hold 
    // the list of numbers in the sequence.
    ArrayList<Integer> list = new ArrayList<>();

    System.out.println("Hello Arithmetic Sequence using Recursion");
    System.out.println();

    System.out.println("Written by Helen Zhou");
    System.out.println();

    System.out.println("An = A(n-1) + d");
    System.out.println("where d is some constant");

    while (true)
    {
      System.out.println();

      // clear your ArrayList
      list.clear();

      // prompt the user to enter the value for a0
      System.out.print("Enter the value for a(0): ");

      // read in the value for a0
      int a0 = input.nextInt();
      input.nextLine();

      // if the user enters 0, break out of the loop
      if (a0 == 0)
      {
        break;
      }

      // prompt the user to enter the value for d
      System.out.print("Enter the value for d: ");
      
      // read in the value for d
      int d = input.nextInt();
      input.nextLine();

      // prompt the user to enter the value for n
      System.out.print("Enter the value for n: ");
      
      // read in the value for n
      int n = input.nextInt();
      input.nextLine();

      System.out.println();
      System.out.println();

      System.out.println("The sequence is: ");
      arithmeticSequence(list, a0, d, n);
      System.out.println(list.toString());
      System.out.println();
    } // end of while true
  } // end of method main

  // Write a recursive method that finds the sequence
  // of terms and adds them to the list.
  // DO NOT PRINT INSIDE THE METHOD
  public static void arithmeticSequence(ArrayList<Integer> list, int a0, int d, int n)
  {
    // check for the base case 1st
    if (n == 0)
    {
      return;
    }
    list.add(a0);
    arithmeticSequence(list, a0 + d, d, n - 1);
  } // end of method arithmeticSequence()

} // end of TheArithmeticSequence
