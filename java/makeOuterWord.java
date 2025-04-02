public class makeOuterWord
{
    /* 2.5 MINUTES
    Given an "out" string length 4, such as "<<>>", 
    and a word, return a new string where the word 
    is in the middle of the out string, e.g. "<<word>>".
    
      makeOutWord("<<>>", "Yay") → "<<Yay>>"
      makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
      makeOutWord("[[]]", "word") → "[[word]]"    
    */   
    
   public static String makeOutWord(String out, String word)
   {
      //write your code in here
      //String makeOutWord = out.substring(0,2) + word + out.substring(2);
      String makeOutWord = out.substring(0,(out.length()/2)) + word + out.substring(out.length()/2);

      return makeOutWord;
   }
   
    
   //DO NOT MESS WITH CODE BELOW THIS LINE   
   public static void main (String[] args)
   {
      System.out.println(makeOutWord("<<>>", "Yay")); // "<<Yay>>"	
      System.out.println(makeOutWord("<<>>", "WooHoo")); // "<<WooHoo>>"		
      System.out.println(makeOutWord("[[]]", "word")); // "[[word]]"	
      System.out.println(makeOutWord("HHoo", "Hello")); // "HHHellooo"		
      System.out.println(makeOutWord("abyz", "YAY")); // "abYAYyz"	   
   }
} 