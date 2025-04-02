import static java.lang.System.*;
public class hasVowel
{
   /*5 min
   Given a string, return true if the it contains a vowel
   in the middle of the string. 
   Retrun false otherwise.
   
   ***You may not use the "brute force approach" and you may only
   use code we've learned in class. 


   hasVowel("Hip") → true
   hasVowel("123cat321") → true
   hasVowel("bbb") → false
   hasVowel("TEXAS") → fasle
   hasVowel("##C##I##A##") → true*/
   
      
   public static boolean hasVowel(String a)
   {
   String vowel = "aeiouAEIOU";
   return vowel.indexOf(a.charAt(a.length()/2))!= -1;
 
   }
   
   
   public static void main(String args[])
   {
     out.println(hasVowel("Heels")); // true
     out.println(hasVowel("WDEXC")); // true
     out.println( hasVowel("hip")); // true
     out.println(hasVowel("bbb")); // false
     out.println(hasVowel("TEXAS")); // false
     out.println(hasVowel("123")); // false	
     out.println(hasVowel("123cat321")); // true
     out.println(hasVowel("sdfghjkl")); // false
     out.println(hasVowel("##C##I##A##")); // true
     	
   }     
}