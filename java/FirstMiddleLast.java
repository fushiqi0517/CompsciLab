import java.util.Scanner;
public class FirstMiddleLast
{
   public static void  main(String[] args)
   {
      //Make a scanner object
      Scanner key = new Scanner(System.in);
      
      //read in a word from the console   
      String word = key.nextLine();
      
      //Use the appropriate String methods to return the sample output
      //Remember to use charAt() and substring() at least once
      System.out.println("word :: " + word);
      System.out.println("first letter :: " + word.charAt(0));
      System.out.println("last letter :: " + word.substring(word.length() - 1)); 
      System.out.println("middle :: " + word.charAt(word.length() / 2));
      
   }
}