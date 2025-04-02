/* 3  min
Given a string, create recursively (no loops) 
a new string where all appearances of "pi" have been 
replaced by "3.14".


changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
*/

public class changePi
{
   
 public static String changePi(String str)  
 {
        if (str.indexOf("pi")!=-1) 
        {
            return changePi(str.substring(0,str.indexOf("pi"))+"3.14" + str.substring(str.indexOf("pi")+2));
        }
        return str;  
   
  
 }
   public static void main (String[] args)
   {
     System.out.println( changePi("xpix"));//"x3.14x"
     System.out.println(changePi("pipi"));//"3.143.14" 
     System.out.println(changePi("pip"));//"3.14p"
     System.out.println(changePi("pi"));//"3.14"
     System.out.println(changePi("hip"));//"hip"
     System.out.println(changePi(""));//""
     System.out.println(changePi("pixx"));//3.14xx
     System.out.println(changePi("xyzzy"));//xyzzy
 

       
   }
}
    