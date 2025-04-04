/*
We have triangle made of blocks. 
The topmost row has 1 block, 
the next row down has 2 blocks, 
the next row has 3 blocks, and so on. 
Compute recursively (no loops or multiplication) 
the total number of blocks in such a triangle 
with the given number of rows.


triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
*/
public class triangle
{
   
  public static int triangle(int rows) 
  {
        // Base case: if there are no rows, there are no blocks
        if (rows == 0) {
            return 0;
        }
        // Recursive case: the number of blocks in the current row plus the number of blocks in the previous rows
        return rows + triangle(rows - 1);
  }

   public static void main (String[] args)
   {
     System.out.println(triangle(0));//0
     System.out.println(triangle(1));//1 
     System.out.println(triangle(2));//3
     System.out.println(triangle(3));//6 
     System.out.println(triangle(4));//10
     System.out.println(triangle(5));//15
     System.out.println(triangle(6));//21
     System.out.println(triangle(7));//28  
       
   }
}
    