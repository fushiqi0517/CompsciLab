public class WordMatch
{
   private String secret;

   public WordMatch(String word)
   {
      secret = word;
   }

   /** Returns a score for guess, as described in part a.
   * Precondition: 0 < guess.length() <= secret.length()
   */
   public int scoreGuess(String guess)
   { 
      /* to be implemented in part a */ 
      int score = 0;
      int guesslength = guess.length();
      int secretlength = secret.length();
      
      for(int i = 0; i <= secretlength - guesslength; i++)
      {
         if(secret.substring(i, i + guesslength).equals(guess))
            score += 1;
      }
      score = score * guesslength * guesslength;
      return score;
   }


   /** Returns the better of two guesses, as determined by scoreGuess and the rules for a
   *	tie-breaker that are described in part b.
   *	Precondition: guess1 and guess2 contain all lowercase letters.
   *	guess1 is not the same as guess2.
   */
   public String ﬁndBetterGuess(String guess1, String guess2)
   { 
      /* to be implemented in part b */ 
      int a = scoreGuess(guess1);
      int b = scoreGuess(guess2);
      if(a == b)
         if(guess1.compareTo(guess2) > 0)
            return guess1;
         else
            return guess2;
      else if(a > b)
         return guess1;
      else
         return guess2;
   }
}