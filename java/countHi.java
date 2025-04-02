/*Given a string, compute recursively (no loops) 
the number of times lowercase "hi" appears in the string.


countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1

*/

public class countHi
{
  

  public static int countHi(String a) 
  {
   
   if (a.indexOf("hi") != -1)
      return 1 + countHi(a.substring(a.indexOf("hi")+2));
   return 0;
     
    
  }

   public static void main (String[] args)
   {
     System.out.println(countHi("xxhixx"));//1
     System.out.println(countHi("xhixhix"));//2
     System.out.println(countHi("hi"));//1
     System.out.println(countHi("hellohhiihello"));//1 (make sure this one works)
     System.out.println(countHi(""));//0
     System.out.println(countHi("hihih"));//2
     System.out.println(countHi("ihihihihih"));//4  
       
   }
}