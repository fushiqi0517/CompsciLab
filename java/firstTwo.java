import static java.lang.System.*;
public class firstTwo
{
   /*2.5 min
   Given a string, return the string made of its first two chars, 
   so the String "Hello" yields "He". 
   If the string is shorter than length 2, 
   return whatever there is, so "X" yields "X", 
   and the empty string "" yields the empty string "". 


   firstTwo("Hello") → "He"
   firstTwo("abcdefg") → "ab"
   firstTwo("ab") → "ab"*/
      
   public static String firstTwo(String s)
   {
   if(s.length()<2)
   return s;

   return s.substring(0,2);
  
      }
   
   
   public static void main(String args[])
   {
      out.println(firstTwo("Hello")); // "He"	
      out.println(firstTwo("abcdefg")); // "ab"		
      out.println(firstTwo("ab")); // "ab"		
      out.println(firstTwo("a")); // "a"	
      out.println(firstTwo("")); // ""		
      out.println(firstTwo("Kitten")); // "Ki"		
      out.println(firstTwo("hi")); // "hi"		
      out.println(firstTwo("hiya")); // "hi"		
   }     
}