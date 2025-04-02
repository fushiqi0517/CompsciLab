import java.util.*;

class MoreRecursionFactorialsAndFibonacci
{

  public static void main(String[] args) 
  {
    // Put your name on this!!!
    System.out.println("Recursive Loops 3 - Written by Helen Zhou");
    System.out.println();
    System.out.println();

    System.out.println("The Fibonacci Numbers and Factorials");  

    // Factorials
    // n! means
    // if n is 0 return 1
    // else return n * (n-1)!
    for (int n=6; n>=0; n--)
    {
      System.out.println(n + "! is " + factorial(n));
    }
    
    System.out.println();

    // fibonacci numbers
    // 0 1 1 2 3 5 8 13 21 34 ...
    System.out.println("Fibonacci sequence is 0 1 1 2 3 5 8 13 21 34 ...");

    for (int n=6; n>=0; n--)
    {
      System.out.println("term " + n + " is " + fibonacci(n));
    }

    System.out.println();
    System.out.println();
    System.out.println();
  } // end of Main method

  // get the nth term of the factorial sequence 
  public static int factorial(int n)
  {
    // check for the base case
    if (n == 0)
    {
      return 1; // Base case: 0! is 1
    }
    return n * factorial(n - 1); // Recursive call
  } // end of method factorial()

  // get the nth term of the fibonacci sequence 
  public static int fibonacci(int term)
  {
    // check for the base cases
    if (term == 0)
    {
      return 0; // Base case: Fibonacci(0) is 0
    }
    
    if (term == 1)
    {
      return 1; // Base case: Fibonacci(1) is 1
    }

    return fibonacci(term - 1) + fibonacci(term - 2); // Recursive case
  } // end of method fibonacci()
} // end of class MoreRecursionFactorialsAndFibonacci
