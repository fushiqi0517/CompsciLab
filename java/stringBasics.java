import java.util.Scanner;
public class stringBasics
{
   public static void main ( String[] args )
	{
		//instantiate a scanner object here; you may pick the name
      Scanner keyboard = new Scanner(System.in);
      
      //declare and initialize your variables here
      String one = keyboard.nextLine();
      String two = keyboard.nextLine();
      
      
      //add code to print out the sample output
      String concat = one + " " + two;
      System.out.println("First:: " + one);
      System.out.println("Second:: " + two);
      System.out.println("Sum:: " + concat);
      System.out.println("Length:: " + concat.length());      
	}

}