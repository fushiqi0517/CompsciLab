public class nTwice
{
   /*4.5 min
   Given a string and an int n, 
   return a string made of the first and 
   last n chars from the string. 
   The string length will be at least n.


   nTwice("Hello", 2) → "Helo"
   nTwice("Chocolate", 3) → "Choate"
   nTwice("Chocolate", 1) → "Ce"*/
      
   public static String nTwice(String s, int n)
   {
   return s.substring(0,n) + s.substring(s.length()-n);
   }
   
   
   public static void main(String args[])
   {
      System.out.println(nTwice("Hello", 2)); // "Helo"		
      System.out.println(nTwice("Chocolate", 3)); // "Choate"		
      System.out.println(nTwice("Chocolate", 1)); // "Ce"		
      System.out.println(nTwice("Chocolate", 0)); // ""	
      System.out.println(nTwice("Hello", 4)); // "Hellello"		
      System.out.println(nTwice("Code", 4)); // "CodeCode"		
      System.out.println(nTwice("Code", 2)); // "Code"	
   }     
}