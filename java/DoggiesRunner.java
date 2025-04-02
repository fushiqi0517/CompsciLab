import java.util.Arrays;
import java.util.Scanner;

public class DoggiesRunner
{
   public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many Dogs are in the pack? :: ");
		int size = keyboard.nextInt(); //size will store what the user enters
		Doggies pack = new Doggies(size);//makes new Doggies object; calls Doggies constructor method
      
      String dogName = "";
      int dogAge = 0;
		for(int i=0; i<size;i++)
		{
         System.out.print("Enter the age :: ");
		   dogAge = keyboard.nextInt(); 
			System.out.print("Enter the name :: ");
		   dogName = keyboard.next();
			
         //***YOUR CODE GOES HERE***
         //call the method to add a new dog to the pack 
         //Hint: look at the Doggie class
         pack.set(i, dogAge, dogName);
         
			
		}		
		System.out.println("pack :: "+pack);
		System.out.println("NAME OF OLDEST :: "+pack.getNameOfOldest());
		System.out.println("NAME OF YOUNGEST :: "+pack.getNameOfYoungest());	      
      	
	}		
}