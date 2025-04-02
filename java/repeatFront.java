public class repeatFront
{
   /*3 min
   Given a string and an int n, return a string made of the first n characters of the string, 
   followed by the first n-1 characters of the string, and so on. 
   You may assume that n is between 0 and the length of the string, 
   inclusive (i.e. n >= 0 and n <= str.length()).


   repeatFront("Chocolate", 4)); // "ChocChoChC"
   repeatFront("Chocolate", 3)); // "ChoChC"
   repeatFront("Ice Cream", 2)); // "IcI"   */
   
   public static String repeatFront(String str, int n) 
   {
   String a = "";
    for(int i = n; i>0; i--){
      //if (n==0)
      //return "";
      a+= str.substring(0,i);}
      
   return a;
   }
   public static void main(String args[])
   {
      System.out.println(repeatFront("Chocolate", 4) ); // "ChocChoChC"	
      System.out.println(repeatFront("Chocolate", 3)); // "ChoChC"		
      System.out.println(repeatFront("Ice Cream", 2)); // "IcI"		
      System.out.println(repeatFront("Ice Cream", 1)); // "I"		
      System.out.println(repeatFront("Ice Cream", 0)); // ""		
      System.out.println(repeatFront("xyz", 3)); // "xyzxyx"		
      System.out.println(repeatFront("", 0)); // ""		
      System.out.println(repeatFront("Java", 4)); // "JavaJavJaJ"		
      System.out.println(repeatFront("Java", 1)); // "J"	  
      }
}