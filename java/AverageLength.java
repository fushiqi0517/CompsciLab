import java.util.Scanner;
public class AverageLength
{
    public static void main( String args[] )
    {
       //instantiate a Scanner object, you may pick the name
       Scanner keyboard = new Scanner (System.in);
       
       //prompt the user to enter two words
       System.out.print("Enter two words separated by a space: ");
       
       //read in and store the words entered by the user  
       String one = keyboard.next();
       String two = keyboard.next();
       
       //calculate the average length of the words and print it out
       String concat = one + " " + two;
       System.out.println("The average length of the words " + concat + " is " + (concat.length())/2.0);
           
    }
}