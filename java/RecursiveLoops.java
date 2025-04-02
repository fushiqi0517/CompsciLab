import java.util.*;

class RecursiveLoops 
{
  public static void main(String[] args) 
  {
    // Put your name on this!!!
    System.out.println("Recursive Loops - Written by Helen Zhou");
    System.out.println();
    System.out.println();

    System.out.println("Sum of the numbers in a list.");  
    int [] array = {90, 80, 85, 95, 74, 93}; 
    
    System.out.println("The list is (with recursion): ");
    printList(array, 0);
    System.out.println();

    System.out.print("The sum of the numbers in the array is: ");
    int sum = getSumOfList(array, 0);
    System.out.println(sum);
    System.out.println();
    System.out.println();

    System.out.print("The sum of the even numbers in the array is: ");
    sum = getSumOfEvensInList(array, 0);
    System.out.println(sum);
    System.out.println();

    System.out.print("The number of even numbers in the array is: ");
    int count = getCountOfEvensInList(array, 0);
    System.out.println(count);
    System.out.println();
  } // end of Main method

  // print out an array with recursion
  public static void printList(int [] ray, int i)
  {
    if (i == ray.length)
    {
      return; // Base case: stop when we reach the end
    }
    System.out.print(ray[i] + " "); // Print the current element
    printList(ray, i + 1); // Recursive call to print the next element
  }

  public static int getSumOfList(int [] ray, int i)
  {
    if (i == ray.length)
    {
      return 0; // Base case: sum of an empty list is 0
    }
    return ray[i] + getSumOfList(ray, i + 1); // Add current element to sum of the rest
  }

  public static int getSumOfEvensInList(int [] ray, int i)
  {
    if (i == ray.length)
    {
      return 0; // Base case: no numbers left to check
    }
    if (ray[i] % 2 == 0)
    {
      return ray[i] + getSumOfEvensInList(ray, i + 1); // Add even number
    }
    return getSumOfEvensInList(ray, i + 1); // Skip odd number
  }

  public static int getCountOfEvensInList(int [] ray, int i)
  {
    if (i == ray.length)
    {
      return 0; // Base case: no numbers left to count
    }
    if (ray[i] % 2 == 0)
    {
      return 1 + getCountOfEvensInList(ray, i + 1); // Count even numbers
    }
    return getCountOfEvensInList(ray, i + 1); // Skip odd numbers
  }
}
