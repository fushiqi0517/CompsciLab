import static java.lang.System.*;
public class theEnd
{
   /*3 min
   Given a string, return a string length 1 (1 char) from its front, 
   unless front is false, in which case return a string length 1 from its back. 
   The string will be non-empty.


   theEnd("Hello", true) → "H"
   theEnd("Hello", false) → "o"
   theEnd("oh", true) → "o"  
   */
   
      
   public static String theEnd(String str, boolean front)
   {
    if (front == true)
    return str.substring(0,1);
    else
    return str.substring(str.length()-1);
   }
   
   
   public static void main(String args[])
   {
     out.println(theEnd("Hello", true)); // "H"		
     out.println(theEnd("Hello", false)); // "o"		
     out.println(theEnd("oh", true)); // "o"	
     out.println(theEnd("oh", false)); // "h"	
     out.println(theEnd("x", true)); // "x"		
     out.println(theEnd("x", false)); // "x"		
     out.println(theEnd("java", true)); // "j"		
     out.println(theEnd("chocolate", false)); // "e"	
     out.println(theEnd("1234", true)); // "1"		
     out.println(theEnd("code", false)); // "e"     	
   }     
}