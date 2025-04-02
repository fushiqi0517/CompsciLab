import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class WordleRunner
{
   public static void main(String args[])
   {
      Random rand = new Random();
      String[] pos = {"HELPS", "RADIO", "TRAIN", "GHOST","SPOOF", "GIANT", "CHAIN", "SHOES", "PHONE", "YOURS"};
      String word = pos[rand.nextInt(9)];
      Wordle bob = new Wordle(word);
      Scanner keyboard = new Scanner(System.in);
		
		String guess ="";
      for(int i = 0; i < 6; i++)
      {
         System.out.print("Guess a 5 letter word (use caps) :: ");
		   guess = keyboard.next();
         System.out.println(bob.guessAWord(guess));
         if(bob.win())
         {
            System.out.println("You guessed the word!");
            break;
         }

      }
      if(!bob.win())
      System.out.println("You're out of guesses, the word was "+ word);
   
   }
}