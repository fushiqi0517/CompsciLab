import java.util.Scanner;
public class helloName
{
    /*
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


    Bob → "Hello Bob!"
    Alice → "Hello Alice!"
    X → "Hello X!"
   */
   
      
   public static void main (String[] args)
   {
     Scanner key = new Scanner(System.in);
     String a = key.next();
     System.out.println("Hello " + a + "!");   
   }
} 