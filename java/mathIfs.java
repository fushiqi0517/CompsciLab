public class mathIfs
{
   public int doMath(int a, int b)
   {
      //write your code here
      if (a > b && b != 0)
         return Math.abs(a - b);
  
       
      else if (b > a && a != 0)
         return a + b;
       
       
       else if (a == b)
         return a * b;
         
         
       else if (a ==0 )
       return b*2;
       
       else if (b == 0)
       return a *2;
             
       else
         return 0;
          
   }
}