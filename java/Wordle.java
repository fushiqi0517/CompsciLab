import java.util.ArrayList;
public class Wordle
{
   private ArrayList<String> answer; //will hold the correct word
   private ArrayList<String> guess; //will hold the users guesses
      
   //fill out the construcor method
   public Wordle(String a)
   {
   answer = new ArrayList<String>();
   guess = new ArrayList<String>();
   for (int i = 0; i < 5; i ++)
   {
   answer.add("" + a.charAt(i));
   }
   }
   
   /*Return an ArrayList that follows the rules below:
   
   If the letter is in the Wordle and it is in the same position, update the 
   guess ArrayList to hold that letter (capitalized)
   
   If the letter is in the Wordle, but NOT in the correct position, update the 
   guess ArrayList to hold that letter lowercase
   
   If the character is NOT in the Wordle, update the 
   guess ArrayList to hold a blank space 
   
   i.e.
   lowercase letter = right letter wrong position
   capital letter =  right letter right position
   blank = wrong letter  
   
   EXAMPLE: if the Wordle is TRAIN and the user guesses RADIO
   this method would return [r, a,  , I, ]
   
   */
   
   public ArrayList<String> guessAWord(String a) 
   {
   guess.clear();
   for (int i = 0; i < 5;i++)
   {
      if(answer.contains("" + a.charAt(i)))
      {
         if(a.charAt(i) == answer.get(i).charAt(0))
            guess.add("" + a.charAt(i));
         else
            guess.add(("" + a.charAt(i)).toLowerCase());
      }
      else
         guess.add(" ");
   }
   return guess;
   }
   
   //return true if the user guessed the word, false otherwise
   public boolean win() 
   {
      
      return (guess.equals(answer));
   }

      
}

private ArrayList<Double> grades;

public Student()
{
   grades = new ArrayList<Double>();
}

double largest = 0.0;

for (int i = 0; i < grades.size(); i++)
{
   if (grades.get(i) > largest)
      largest = grades.get(i);
}
return largest;

public double getAverage()
{
double sum = 0.0;

for (int i = 0; i < grades.size(); i++)   
   sum = sum + grades.get(i);
   
return sum/grades.size();