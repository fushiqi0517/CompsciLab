public class StringsFunhouse
{

   //NOTE: no constructor methods are needed for this lab
  
   /*Part 1: sameFirstLetter
   Given two strings, return 1 if the first letter of 
   each string is the same.
   Otherwise, return -1.  */
   public int sameFirstLetter(String a, String b)
   {
      if (a.charAt(0) == b.charAt(0))
         return 1;
      else
         return -1;
   }
   
   
   /*Part 2: vowelOrDigit
   Return true if the first character is a vowel or a digit.
   Otherwise, return false    */
   public boolean vowelOrDigit(String str)
   {
      if (str.charAt(0)== 'a' ||str.charAt(0)== 'e' || str.charAt(0)== 'i' || str.charAt(0)== 'o' || str.charAt(0)== 'u' ||str.charAt(0)== '1' || str.charAt(0)== '2'||str.charAt(0)== '3'||str.charAt(0)== '4'||str.charAt(0)== '5'||str.charAt(0)== '6'||str.charAt(0)== '7'||str.charAt(0)== '8'||str.charAt(0)== '9'||str.charAt(0)== '0'||str.charAt(0)== 'A' ||str.charAt(0)== 'E' || str.charAt(0)== 'I' || str.charAt(0)== 'O' || str.charAt(0)== 'U')
      return true;
      else
      return false;
   }
   
   
   /*Part 3: firstLastVowel
   Return "yes" if the first or last letter 
   of the string is a vowel. 
   Otherwise, return no. */
   public String firstLastVowel(String str)
   {
      
      String vowel = "aeiouAEIOU";
      if (vowel.indexOf(str.charAt(0))== -1 && vowel.indexOf(str.charAt(str.length()-1))== -1 )
      return "no";
      else
      return "yes";
   }

      
   /*Part 4: firstRepeats
   Return true if the first letter of a given string repeats 
   anywhere else in the string
   Return false, otherwise.  
   (Do not use any methods we have not learned in class)*/
   public boolean firstRepeats(String a)
   {
      String aWithoutFirst = a.substring(1);
      if (aWithoutFirst.indexOf(a.charAt(0)) == -1)
      return false;
      else
      return true;
      
   }
}    