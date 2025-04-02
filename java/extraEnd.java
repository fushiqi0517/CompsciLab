public class extraEnd
{
    /* 2.5 MINUTES
    Given a string, return a new string made of 3 copies of 
    the last 2 chars of the original string. 
    The string length will be at least 2.


      extraEnd("Hello") → "lololo"
      extraEnd("ab") → "ababab"
      extraEnd("Hi") → "HiHiHi"    
    */   
    
   public static String extraEnd(String s)
   {
   return s.substring(s.length()-2) + s.substring(s.length()-2) + s.substring(s.length()-2) + s.substring(s.length()-2);
   }
   
    
   public static void main (String[] args)
   {
      System.out.println(extraEnd("Hello")); // "lololo"	
      System.out.println(extraEnd("ab")); // "ababab"		
      System.out.println(extraEnd("Hi")); // "HiHiHi"	
      System.out.println(extraEnd("Candy")); // "dydydy"		
      System.out.println(extraEnd("code")); // "dedede"	   
   }
} 