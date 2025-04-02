public class oddFive
{
 // 3 min 
 // Return the sum of all the odd numbers in the matrix.
 // Except the number 5 is not conidered odd anymore.
  public static int oddFive (int[][] matrix)
  {
  int sum = 0;
   for (int i = 0; i< matrix.length; i++)
   {
      for (int c = 0; c< matrix[i].length; c++)
      {
         if ((matrix[i][c] % 2 == 1) &&  (matrix[i][c] != 5))
            sum = sum + matrix[i][c];
      }
   }
   return sum;
  }

   public static void main (String[] args)
    {
     System.out.println(oddFive(new int[][] {{1,2,2,1}}));//2
     System.out.println(oddFive(new int[][] {{2,4,6,7}}));//7
     System.out.println(oddFive(new int[][] {{4,2,6,8}}));//0
     System.out.println(oddFive(new int[][] {{3,1,9,5}}));//13
     System.out.println(oddFive(new int[][] {{5,8,0,3}}));//3
     System.out.println(oddFive(new int[][] {{0,0,0,0}}));//0
     System.out.println(oddFive(new int[][] {{3,3,6,7}}));//13 
     System.out.println(oddFive(new int[][] {{3,5,8,9}}));//12  
     System.out.println(oddFive(new int[][] {{8,7,9,5}}));//16
     System.out.println(oddFive(new int[][] {{9,5,4,3}}));//12
                                                    
    }
   

}
