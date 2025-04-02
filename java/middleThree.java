public class middleThree
{
   /*3.5 min
   Given a string of odd length, 
   return the string length 3 from its middle, 
   so "Candy" yields "and". 
   The string length will be at least 3.


      middleThree("Candy") → "and"
      middleThree("and") → "and"
      middleThree("solving") → "lvi"   */
   
   public static String middleThree(String str)
   {
   return str.substring(str.length()/2 - 1,str.length()/2 -1+3);
   }
   
   
   public static void main(String args[])
   {
      System.out.println(middleThree("candy"));// "and"		
      System.out.println(middleThree("and")); // "and"		
      System.out.println(middleThree("solving")); // "lvi"	
      System.out.println(middleThree("Hi yet Hi")); // "yet"	
      System.out.println(middleThree("java yet java")); // "yet"
      System.out.println(middleThree("Chocolate")); // "col"
      System.out.println(middleThree("XabcxyzabcX")); // "xyz
   }
}