public class doubleChar
{
   /* 3 min
   Given a string, return a string where for every char 
   in the original, there are two chars.


   doubleChar("The") → "TThhee"
   doubleChar("AAbb") → "AAAAbbbb"
   doubleChar("Hi-There") → "HHii--TThheerree"
   */
   
   public static String doubleChar(String str) 
   {
   String a = "";
   for (int i =0; i < str.length();i++)
      a += "" + str.charAt(i) + str.charAt(i);
   
   return a; 
   }	
   
   public static void main (String[] args)
   {
     System.out.println(doubleChar("The"));//TThhee	    
     System.out.println(doubleChar("AAbb"));//AAAAbbbb
     System.out.println(doubleChar("Hi-There"));//HHii--TThheerree
     System.out.println(doubleChar("Word!"));//WWoorrdd!!
     System.out.println(doubleChar("!!"));//!!!!
     System.out.println(doubleChar(""));//*empty string*
     System.out.println(doubleChar("The"));//TThhee	
     System.out.println(doubleChar("a"));//aa				     
   }
   
}
