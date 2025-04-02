public class lastTwo
{
   /*3 min
   Given a string of any length, 
   return a new string where the last 2 chars,
   if present, are swapped, so "coding" yields "codign".


   lastTwo("coding") → "codign"
   lastTwo("cat") → "cta"
   lastTwo("ab") → "ba"
    */  
      
   public static String lastTwo(String str)
   {
     
     
      if (str.length() < 2)
      
      return str;     
      
      else
     
      return str.substring(0,str.length()-2)+ str.charAt(str.length()-1) + str.charAt(str.length()-2);

   }
   
   
   public static void main(String args[])
   {
     System.out.println(lastTwo("coding")); // "codign"		
     System.out.println(lastTwo("cat")); // "cta"	
     System.out.println(lastTwo("ab")); // "ba"		
     System.out.println(lastTwo("a")); // "a"		
     System.out.println(lastTwo("")); // ""
   }     
}