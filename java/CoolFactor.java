import java.util.*;
import java.io.*;

class CoolFactor
{
  // Print your list in the proper format.
  // The output must be exact for credit.
  // See the sample output.
  // You should use System.out.printf("%-10s%.3f", ?, ?);
  // The -10 means left justify using 10 print positions.
  // The s means to print a String.
  // The f means to print a float or a double.
  // The .3 means to round the output to 3 decimal positions.
  public static void printArrayList(ArrayList<CoolObject> list)
  {
    for (CoolObject obj : list) {
      System.out.printf("%-10s%.3f\n", obj.getFirstName(), obj.getCoolIndex());
    }
  }


  public static int getNumberOfVowels(String s)
  {
    int count = 0;
    String vowels = "aeiouAEIOU";
    for (int i = 0; i < s.length(); i++) {
      if (vowels.indexOf(s.charAt(i)) != -1) {
        count++;
      }
    }
    return count;
  }


  public static void main(String[] args) throws Exception
  {
    System.out.println("The Cool Index");
    System.out.println();
    // Your name here
    System.out.println("My name is Helen Zhou");
    System.out.println();

    // Create an ArrayList to hold CoolObject items
    ArrayList<CoolObject> list = new ArrayList<>();
    
    // Create a new Scanner object to read in the data.
    Scanner input = new Scanner(new File("cool.dat"));

    // read in the number of data sets
    int numberOfPeople = input.nextInt();
    input.nextLine(); // moves the file cursor down a line
   
    // Loop through the file to read in the number of people
    for (int lines = 1; lines <= numberOfPeople; lines++)
    {
      // Read in the first name of the person
      String firstName = input.nextLine();

      // Calculate the cool factor of the name by
      // dividing the number of vowels in the name
      // by the total number of letters in the name
      int numVowels = getNumberOfVowels(firstName); // call the method 
      double coolFactor = (double) numVowels / firstName.length();
      
      // Create a CoolObject
      CoolObject coolObject = new CoolObject(firstName, coolFactor);
      
      // Add this CoolObject to the ArrayList
      list.add(coolObject);
    }
    
    System.out.println();
    System.out.println("Original Cool Data");
    printArrayList(list);    

    // Sort the ArrayList from largest cool factor to 
    // smallest cool factor.
    Collections.sort(list);
    
    System.out.println();
    System.out.println("Sorted Cool Data");
    printArrayList(list);
    
    System.out.println();
    System.out.println("Goodbye!");
    System.out.println();
    
  } // end of method main()
  
} // end of class Main


class CoolObject implements Comparable
{
   // Define a private String variable to hold the 
   // first name.  Name it firstName.
   private String firstName;
   
   // Define a private double variable to hold the 
   // cool index.  Name it coolIndex.
   private double coolIndex;
   
   // Write a constructor
   public CoolObject(String firstName, double coolIndex)
   {
     this.firstName = firstName;
     this.coolIndex = coolIndex;
   }
   
   public String getFirstName()
   {
     return firstName;
   }

   public double getCoolIndex()
   {
     return coolIndex;
   }
 
   // Write a compareTo() method
   public int compareTo(Object otherObject)
   {
     CoolObject other = (CoolObject) otherObject;
    
     // return a positive number if this coolIndex
     // is larger than the other coolIndex
     if (this.coolIndex > other.getCoolIndex())
       return -1;

     // return a negative number if this coolIndex
     // is smaller than the other coolIndex
     if (this.coolIndex < other.getCoolIndex())
       return 1;

     // if it gets here, return 0 to indicate that
     // they have the same coolIndex     
     return 0;
   }
}
