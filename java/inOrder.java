public class inOrder
{
   /*2.5 min
   Given three ints, a b c, return true if b is greater than a, 
   and c is greater than b. However, with the exception that if "bOk" 
   is true, b does not need to be greater than a.


   System.out.println(inOrder(1, 2, 4, false) // true
   System.out.println(inOrder(1, 2, 1, false) // false
   System.out.println(inOrder(1, 1, 2, true) // true
   */
   
   public static boolean inOrder(int a, int b, int c, boolean bOk) 
   {
     if ((a<b && b < c)|| (bOk && c>b))
     return true;
     else
     return false;
   }

   public static void main(String args[])
   {
      System.out.println(inOrder(1, 2, 4, false)); // true		
      System.out.println(inOrder(1, 2, 1, false)); // false	
      System.out.println(inOrder(1, 1, 2, true)); // true	
      System.out.println(inOrder(3, 2, 4, false)); // false		
      System.out.println(inOrder(2, 3, 4, false)); // true		
      System.out.println(inOrder(3, 2, 4, true)); // true	
      System.out.println(inOrder(4, 2, 2, true)); // false		
      System.out.println(inOrder(4, 5, 2, true)); // false		
      System.out.println(inOrder(2, 4, 6, true)); // true	
      System.out.println(inOrder(7, 9, 10, false)); // true		
      System.out.println(inOrder(7, 5, 6, true)); // true		
      System.out.println(inOrder(7, 5, 4, true)); // false
   }
}