public class PigLatinConverter
{
/**
*Precondition: ch may be an upper or lower-case alphabetic character
*Parameter - ch a single-character string
*Return - true if ch is a vowel, false otherwise
*/
   public boolean isVowel(String ch)
   { 
   String Vowel = "AEIOUaeiou";
   if (Vowel.indexOf(ch) != -1)
   return true;
   else
   return false;
     /* to be implemented in part (a) */
   }

/**
*Precondition: word is not null and may begin with a vowel 
*              or consonant. You must use isVowel from part a.
*Parameter word, the word to be converted to Pig Latin
*Return - the Pig Latin form of word
*/
   public String toPig(String word)
   { 
   if (isVowel(word.substring(0,1))==true)
   return word + "yay";
   else
   return word.substring(1) + word.substring(0,1) + "ay";
      /* to be implemented in part (b) */
   }

/**
	* Precondition:	myLine contains at least one word.
	*			Words are separated by exactly one space.
	*			There is no punctuation in myLine.
	*			You must use toPig from part b.
* Postcondition: myLine has been converted to Pig Latin.
		* 			 Words are separated by one space.
* Return – a string that contains the converted words 

*/
   public String convertLine(String myLine)
   {
   String a = "";
   int b = 0;
   for (int i=0; i < myLine.length(); i++)
   {
      if (myLine.charAt(i)== ' ' || i == myLine.length()-1)
      {
         if (i == myLine.length()-1)
            a += toPig(myLine.substring(b,i+1));
         else
            a += toPig(myLine.substring(b,i)) + " ";
         b = i+1;
      }
   }
   return a;
   /* to be implemented in part (c) */
   }
}