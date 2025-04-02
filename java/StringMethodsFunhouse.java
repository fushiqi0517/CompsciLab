public class StringMethodsFunhouse
{
  /*DIRECTIONS: Complete each of the following methods. 
  The first 3 students to complete each problem will receive a warmup stamp.
  */
  
  /*NUMBER 1
  A sandwich is two pieces of bread with something in 
  between. Return the string that is between the first 
  and last appearance of "bread" in the given string, 
  or return the empty string "" if there are not two 
  pieces of bread.

   
   getSandwich("breadjambread") → "jam"
   getSandwich("xxbreadjambreadyy") → "jam"
   getSandwich("xxbreadyy") → ""*/
  
  public String getSandwich(String str) 
  {
   String a = "bread";
   if(str.indexOf(a) != str.lastIndexOf(a))
      return str.substring(str.indexOf(a)+ a.length(),str.lastIndexOf(a));
   else
      return "";
  }

  /*NUMBER 2
  Return true if the given string contains an appearance of "xyz" 
  where the xyz is not directly preceeded by a period (.). 
  So "xxyz" counts but "x.xyz" does not.


   xyzThere("abcxyz") → true
   xyzThere("abc.xyz") → false
   xyzThere("xyz.abc") → true*/   
  public boolean xyzThere(String str) 
  {
   String a = "xyz";
   String b = ".xyz";
   if((str.indexOf(a)!= -1) && (str.indexOf(b) == -1))
      return true;
   else
      return false;
      
   }
   
   /*NUMBER 3
   Given two strings, a and b, create a bigger string made of the 
   first char of a, the first char of b, the second char of a, 
   the second char of b, and so on. Any leftover chars go at the 
   end of the result.


   mixString("abc", "xyz") → "axbycz"
   mixString("Hi", "There") → "HTihere"
   mixString("xxxx", "There") → "xTxhxexre"*/
   
   public String mixString(String a, String b) 
   {
    int longer = 0;
    String bigger = "";
    
    if(a.length() > b.length()){
      longer += b.length();
      
      for (int z = 0; z < longer; z++){
            bigger += a.substring(z,z+1) + b.substring(z,z+1);}
      bigger += a.substring(longer);}
      
    else{
      longer += a.length();
      
      for (int z = 0; z < longer; z++){
            bigger += a.substring(z,z+1) + b.substring(z,z+1);}
      bigger += b.substring(longer);}
    
    

    
     return bigger;  
   }

   /*NUMBER 4
   Look for patterns like "zip" and "zap" in the string -- length-3,
   starting with 'z' and ending with 'p'. 
   Return a string where for all such words, the middle letter is 
   gone, so "zipXzap" yields "zpXzp".
   
   
   zipZap("zipXzap") → "zpXzp"
   zipZap("zopzop") → "zpzp"
   zipZap("zzzopzop") → "zzzpzp"*/
   
   public String zipZap(String str) 
   {
   String a = "";

   if (str.length() <= 2) 
      return str;

   for (int i = 0; i < str.length(); i++) 
   {
      if ((str.substring(i, i + 1).equals("z")) && (str.substring(i + 2, i + 3).equals("p"))) 
      {
         a += str.substring(i, i + 1) + str.substring(i + 2, i + 3);
         i += 2;
      } 
      else 
      {
      a += str.substring(i, i + 1);
      }
   }
   return a;

   }

   public static void main(String[] args)
   {
   
       //***Do not change any code in the main***//
       StringMethodsFunhouse a = new StringMethodsFunhouse();
       
         System.out.println("NUMBER 1\n");
         
         System.out.println(a.getSandwich("breadjambread")); // "jam"	"jam"	OK	
         System.out.println(a.getSandwich("xxbreadjambreadyy")); // "jam"	"jam"	OK	
         System.out.println(a.getSandwich("xxbreadyy")); // ""	""	OK	
         System.out.println(a.getSandwich("xxbreadbreadjambreadyy")); // "breadjam"	"breadjam"	OK	
         System.out.println(a.getSandwich("breadAbread")); // "A"	"A"	OK	
         System.out.println(a.getSandwich("breadbread")); // ""	""	OK	
         System.out.println(a.getSandwich("abcbreaz")); // ""	""	OK	
         System.out.println(a.getSandwich("xyz")); // ""	""	OK	
         System.out.println(a.getSandwich("")); // ""	""	OK	
         System.out.println(a.getSandwich("breadbreaxbread")); // "breax"	"breax"	OK	
         System.out.println(a.getSandwich("breaxbreadybread")); // "y"	"y"	OK	
         System.out.println(a.getSandwich("breadbreadbreadbread")); // "breadbread"
      
         System.out.println("\nNUMBER 2\n");
         System.out.println(a.xyzThere("abcxyz")); // true	true	OK	
         System.out.println(a.xyzThere("abc.xyz")); // false	false	OK	
         System.out.println(a.xyzThere("xyz.abc")); // true	true	OK	
         System.out.println(a.xyzThere("abcxy")); // false	false	OK	
         System.out.println(a.xyzThere("xyz")); // true	true	OK	
         System.out.println(a.xyzThere("xy")); // false	false	OK	
         System.out.println(a.xyzThere("x")); // false	false	OK	
         System.out.println(a.xyzThere("")); // false	false	OK	
         System.out.println(a.xyzThere("abc.xyzxyz")); // true	true	OK	
         System.out.println(a.xyzThere("abc.xxyz")); // true	true	OK	
         System.out.println(a.xyzThere(".xyz")); // false	false	OK	
         System.out.println(a.xyzThere("12.xyz")); // false	false	OK	
         System.out.println(a.xyzThere("12xyz")); // true	true	OK	
         System.out.println(a.xyzThere("1.xyz.xyz2.xyz")); // false
         
         System.out.println("\nNUMBER 3\n");
         
         System.out.println(a.mixString("abc", "xyz")); // "axbycz"	"axbycz"	OK	
         System.out.println(a.mixString("Hi", "There")); // "HTihere"	"HTihere"	OK	
         System.out.println(a.mixString("xxxx", "There")); // "xTxhxexre"	"xTxhxexre"	OK	
         System.out.println(a.mixString("xxx", "X")); // "xXxx"	"xXxx"	OK	
         System.out.println(a.mixString("2/", "27 around")); // "22/7 around"	"22/7 around"	OK	
         System.out.println(a.mixString("", "Hello")); // "Hello"	"Hello"	OK	
         System.out.println(a.mixString("Abc", "")); // "Abc"	"Abc"	OK	
         System.out.println(a.mixString("", "")); // ""	""	OK	
         System.out.println(a.mixString("a", "b")); // "ab"	"ab"	OK	
         System.out.println(a.mixString("ax", "b")); // "abx"	"abx"	OK	
         System.out.println(a.mixString("a", "bx")); // "abx"	"abx"	OK	
         System.out.println(a.mixString("So", "Long")); // "SLoong"	"SLoong"	OK	
         System.out.println(a.mixString("Long", "So")); // "LSoong"	"LSoong"
         
         System.out.println("\nNUMBER 4\n");
         
         System.out.println(a.zipZap("zipXzap")); // "zpXzp"	"zpXzp"	OK	
         System.out.println(a.zipZap("zopzop")); // "zpzp"	"zpzp"	OK	
         System.out.println(a.zipZap("zzzopzop")); // "zzzpzp"	"zzzpzp"	OK	
         System.out.println(a.zipZap("zibzap")); // "zibzp"	"zibzp"	OK	
         System.out.println(a.zipZap("zip")); // "zp"	"zp"	OK	
         System.out.println(a.zipZap("zi")); // "zi"	"zi"	OK	
         System.out.println(a.zipZap("z")); // "z"	"z"	OK	
         System.out.println(a.zipZap("")); // ""	""	OK	
         System.out.println(a.zipZap("zzp")); // "zp"	"zp"	OK	
         System.out.println(a.zipZap("abcppp")); // "abcppp"	"abcppp"	OK	
         System.out.println(a.zipZap("azbcppp")); // "azbcppp"	"azbcppp"	OK	
         System.out.println(a.zipZap("azbcpzpp")); // "azbcpzp"	"azbcpzp"

       
   }

}