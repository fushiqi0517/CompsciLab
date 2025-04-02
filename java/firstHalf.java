public class firstHalf
{
    /* 2 MINUTES
    Given a string of even length, 
    return the first half. So the string "WooHoo" yields "Woo".


   firstHalf("WooHoo") → "Woo"
   firstHalf("HelloThere") → "Hello"
   firstHalf("abcdef") → "abc"
    
    */   
    
   public static String firstHalf(String s)
   {
      //write your code in here
      
      String firstHalf = s.substring(0, s.length()/2);
      return firstHalf; 
   
   }
   
    
   //DO NOT MESS WITH CODE BELOW THIS LINE   
   public static void main (String[] args)
   {
      System.out.println(firstHalf("WooHoo")); // "Woo"	
      System.out.println(firstHalf("HelloThere")); // "Hello"	
      System.out.println(firstHalf("abcdef")); // "abc"	
      System.out.println(firstHalf("ab")); // "a"		
      System.out.println(firstHalf("")); // ""		
      System.out.println(firstHalf("0123456789")); // "01234"		
      System.out.println(firstHalf("kitten")); // "kit"	   
              
   }
} 