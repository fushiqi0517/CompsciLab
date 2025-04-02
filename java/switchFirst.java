import java.util.Scanner;
public class switchFirst
{
    /* 4 MINUTES
    Given two strings, a and b, return a new string that has the first letter of the 
    second string b plus all of the letters from the first string a
    minus the first letter. 


    dog cats → cog
    ap comp → cp
    plus times → tlus
    apple banana → bpple
    */   
      
   public static void main (String[] args)
   {
     Scanner key = new Scanner(System.in);    
     String one = key.next();
     String two = key.next();
     System.out.println(two.charAt(0) + one.substring(1));
     
          
              
   }
} 