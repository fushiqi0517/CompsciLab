import java.util.ArrayList;
public class PigLatinConverterList
{
   private String myLine;

   public PigLatinConverterList(String str)
   { 
      myLine = str;
      pigLatin(); 
   }
   
   /**
   *Precondition: ch may be an upper or lower-case alphabetic character
   *Parameter - ch a single-character string
   *Return - true if ch is a vowel, false otherwise
   */
   public boolean isVowel(String ch)
   { 
   /* should have been implemented in part (a) of original PigLatinConverter Lab; copy it over */
   String Vowel = "AEIOUaeiou";
   if (Vowel.indexOf(ch) != -1)
      return true;
   else
      return false;
   }

   /**
   *Precondition: word is not null and may begin with a vowel 
   *              or consonant. You may use isVowel from part a.
   *Parameter ñ word, the word to be converted to Pig Latin
   *Return - the Pig Latin form of word
   */
   public String toPig(String word)
   { 
   /* should have been implemented in part (b) of original PigLatinConverter Lab; copy it over */
   if (isVowel(word.substring(0,1))==true)
      return word + "yay";
   else
      return word.substring(1) + word.substring(0,1) + "ay";
   }
   
   /**	Private helper method
	* Precondition:	myLine contains at least one word.
	*			Words are separated by exactly one space.
	*			There is no punctuation in myLine.
	* Postcondition:	myLine is unchanged.
   * @return a list of words in myLine
   */
   private ArrayList<String> getLineWords()
   { 
   
      /* to be implemented in part (a) */
   ArrayList<String> a = new ArrayList<String>();
   int b = 0;
   for (int i=0; i < myLine.length(); i++)
   {
      if (i == myLine.length()-1)
            a.add(myLine.substring(b,i+1));
      if(myLine.charAt(i)== ' '){
            a.add(myLine.substring(b,i));
            b = i+1;}
      }
   return a;
   }

   /**
   * Mutator method
	* Precondition:	myLine contains at least one word.
	*			Words are separated by exactly one space.
	*			There is no punctuation in myLine.
	* Postcondition:	myLine has been converted to Pig Latin.
	*			The Pig Latin words are separated by one space.
   */
   public void pigLatin()
   { 
   
      /* to be implemented in part (b) */   
      
      ArrayList<String> a = getLineWords();
      String line = "";
      for(int i = 0; i < a.size(); i++)
         line += toPig(a.get(i)) + " ";
         myLine = line;
   }
   
   public String toString()
   { 
     return myLine;
   }
   
   
}
