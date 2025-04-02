import java.util.Scanner;
public class MathInput
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      int x = keyboard.nextInt();
      int y = keyboard.nextInt();
      int sum = x+y;
      int difference = x-y;
      int product = x*y;
      int quotient = x/y;
      int remainder = x % y;
      System.out.println(x + " " + y);
      System.out.println(x + " + " + y + " = " + sum);
      System.out.println(x + " - " + y + " = " + difference);
      System.out.println(x + " * " + y + " = " + product);
      System.out.println(x + " / " + y + " = " + quotient);
      System.out.println(x + " % " + y + " = " + remainder);
   }
}